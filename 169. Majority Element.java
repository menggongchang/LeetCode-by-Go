import java.util.HashMap;

class Solution {
	public int majorityElement(int[] nums) {
		int majority = nums.length / 2;

		HashMap<Integer, Integer> number = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (number.containsKey(nums[i])) {
				int old = number.get(nums[i]);
				if (old + 1 > majority) {
					return nums[i];
				} else {
					number.put(nums[i], old + 1);
				}
			} else {
				number.put(nums[i], 1);
			}
		}
		return nums[0];
	}
}