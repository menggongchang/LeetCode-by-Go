import java.util.Arrays;
import java.util.HashMap;

class Solution {
	public int findPairs(int[] nums, int k) {

		int number = 0;
		HashMap<Integer, Boolean> pairs = new HashMap<Integer, Boolean>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			if (i == nums.length - 1) {
				break;
			}
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] - nums[i] < k) {
					continue;
				} else if (nums[j] - nums[i] == k) {
					if (!pairs.containsKey(nums[i])) {
						pairs.put(nums[i], true);
						number++;
					}
					break;
				}
			}
		}
		return number;
	}
}