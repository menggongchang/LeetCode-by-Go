class Solution {
	public int dominantIndex(int[] nums) {
		int N = nums.length;
		if (N == 0) {
			return -1;
		}
		if (N == 1) {
			return 0;
		}
		// 1.find max value
		int max = nums[0];
		for (int i = 1; i < N; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		// 2.judge
		int index = -1;
		boolean result = true;
		for (int i = 0; i < N; i++) {
			if (nums[i] == max) {
				index = i;
			} else {
				if (2 * nums[i] > max) {
					result = false;
					break;
				}
			}
		}
		// 3.output
		if (result) {
			return index;
		} else {
			return -1;
		}
	}
}