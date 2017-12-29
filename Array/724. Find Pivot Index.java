//class Solution {
//	public int pivotIndex(int[] nums) {
//		int N = nums.length;
//		if (N == 0) {
//			return -1;
//		}
//		if (N == 1) {
//			return 0;
//		}
//		if (N == 2 && nums[N - 1] == 0) {
//			return 0;
//		}
//
//		int leftSum = 0;
//		int rightSum = 0;
//		int result = -1;
//		for (int i = 0; i < N; i++) {
//			// left
//			for (int k = i - 1; k >= 0; k--) {
//				leftSum += nums[k];
//			}
//			// right
//			for (int k = i + 1; k < N; k++) {
//				rightSum += nums[k];
//			}
//
//			if (leftSum == rightSum) {
//				result = i;
//				break;
//			} else {
//				leftSum = rightSum = 0;
//			}
//		}
//
//		return result;
//	}
//}


/**
*https://leetcode.com/problems/find-pivot-index/solution/
*/

class Solution {
	public int pivotIndex(int[] nums) {
		int N = nums.length;
		if (N == 0) {
			return -1;
		}
		if (N == 1) {
			return 0;
		}
		if (N == 2 && nums[N - 1] == 0) {
			return 0;
		}

		int sum = 0;
		for (int x : nums) {
			sum += x;
		}

		int leftSum = 0;
		int result = -1;
		for (int i = 0; i < N; i++) {
			if (sum - nums[i] == 2 * leftSum) {
				result = i;
				break;
			} else {
				leftSum += nums[i];
			}
		}
		return result;
	}
}
