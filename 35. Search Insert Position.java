class Solution {
	public int searchInsert(int[] nums, int target) {
		int N = nums.length;

		if (N == 0)
			return 0;

		for (int i = 0; i < N; i++) {
			if (nums[i] == target) {
				return i;
			} else if (nums[i] > target) {
				return i;
			}
		}

		return N;
	}
}