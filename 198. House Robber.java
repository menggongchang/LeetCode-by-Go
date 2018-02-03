class Solution {
	public int rob(int[] nums) {
		int n = nums.length;
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return nums[0];
		}
		if (n == 2) {
			return Math.max(nums[0], nums[1]);
		}

		int left = nums[0];
		int right = Math.max(nums[0], nums[1]);
		int answer = 0;
		for (int i = 2; i < n; i++) {
			answer = Math.max(nums[i] + left, right);
			left = right;
			right = answer;
		}
		return answer;
	}
}