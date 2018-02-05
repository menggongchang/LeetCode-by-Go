class Solution {
	public int findLengthOfLCIS(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		// 判断是否Input: [2,2,2,2,2]这种形式
		boolean same = true;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				same = false;
				break;
			}
		}
		if (same) {
			return 1;
		}

		//
		int length = 1;
		int length_ = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] > nums[i]) {
				length_++;
			} else {
				length = Math.max(length, length_);
				length_ = 1;
			}
		}
		length = Math.max(length, length_);
		return length;
	}
}