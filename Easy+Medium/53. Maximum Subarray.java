class Solution {
	public int maxSubArray(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int[] temp = new int[nums.length];// 记录以index=i为右边界的最大的子序列的和；

		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				temp[i] = nums[i];
			} else {
				if (temp[i - 1] < 0) {
					temp[i] = nums[i];
				} else {
					temp[i] = temp[i - 1] + nums[i];
				}
			}
			max = Math.max(max, temp[i]);
		}
		return max;
	}
}