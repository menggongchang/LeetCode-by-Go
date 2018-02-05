import java.util.Arrays;

class Solution {
	public int findLHS(int[] nums) {
		Arrays.sort(nums);
		int longest = 0;
		for (int i = 0; i < nums.length; i++) {
			int temp = 1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] - nums[i] <= 1) {
					temp++;
				} else {
					break;
				}
			}
			if (temp > longest && nums[i + temp-1] - nums[i] == 1) {
				longest = temp;
			}
		}
		return longest;
	}
}