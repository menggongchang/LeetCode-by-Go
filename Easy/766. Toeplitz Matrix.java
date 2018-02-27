class Solution {

	public static void main(String[] args) {
		int[][] data = { { 11, 74, 0, 93 }, { 40, 11, 74, 7 } };
		System.out.println(isToeplitzMatrix(data));
	}

	public static boolean isToeplitzMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return false;
		}
		int L = matrix.length;
		int R = matrix[0].length;
		for (int i = 0; i < L - 1; i++) {
			int j = 0;
			int number = matrix[i][j];
			int ii =i;
			while (ii < L && j < R) {
				if (matrix[ii][j] == number) {
					ii++;
					j++;
				} else {
					return false;
				}
			}
		}
		for (int j = 1; j < R - 1; j++) {
			int i = 0;
			int number = matrix[i][j];
			int jj=j;
			while (i < L && jj < R) {
				if (matrix[i][jj] == number) {
					i++;
					jj++;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}