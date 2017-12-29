class Solution {
	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int miniMax = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (miniMax > 0) {
				miniMax = miniMax + nums[i];
				if (miniMax > max) {
					max = miniMax;
				}
			} else {
				miniMax = nums[i];
				if (miniMax > max) {
					max = miniMax;
				}
			}
		}
		return max;
	}
}