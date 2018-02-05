class Solution {
	public int[] findErrorNums(int[] nums) {
		int temp[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			temp[nums[i] - 1]++;
		}
		int repetition = 0;
		int miss = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == 0) {
				miss = i + 1;
			} else if (temp[i] == 2) {
				repetition = i + 1;
			}
			if (repetition != 0 && miss != 0) {
				break;
			}
		}
		return new int[] { repetition, miss };
	}
}
