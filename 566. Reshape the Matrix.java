class Solution {
	public int[][] matrixReshape(int[][] nums, int r, int c) {

		int size = 0;
		for (int i = 0; i < nums.length; i++) {
			size += nums[i].length;
		}
		if (size != r * c) {// given parameters is not possible and legal;
			return nums;
		}

		int[] temp = new int[size];
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				temp[k] = nums[i][j];
				k++;
			}
		}

		k = 0;
		int[][] result = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				result[i][j] = temp[k];
				k++;
			}
		}
		return result;
	}
}