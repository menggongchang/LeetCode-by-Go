//https://leetcode.com/problems/non-decreasing-array/discuss/106826/
class Solution {
	public boolean checkPossibility(int[] nums) {

		int count = 0;// change count
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				count++;
			} else {
				continue;
			}

			if (count > 1) {
				break;
			}

			if (i == 0 || nums[i - 1] <= nums[i + 1]) {
				nums[i] = nums[i + 1];
			} else {
				nums[i + 1] = nums[i];
			}
		}

		if (count <= 1) {
			return true;
		} else {
			return false;
		}
	}
}