class Solution {
	public int[][] imageSmoother(int[][] M) {
		int[][] temp = new int[M.length][];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = M[i].clone();
		}
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {

				int count = 0;// 记录surrounding cells
				int sum = 0;
				// ROW1
				if (i - 1 >= 0) {
					if (j - 1 >= 0 && j - 1 < M[i - 1].length) {
						sum += M[i - 1][j - 1];
						count++;
					}
					if (j >= 0 && j < M[i - 1].length) {
						sum += M[i - 1][j];
						count++;
					}
					if (j + 1 >= 0 && j + 1 < M[i - 1].length) {
						sum += M[i - 1][j + 1];
						count++;
					}
				}
				// ROW2
				{
					if (j - 1 >= 0) {
						sum += M[i][j - 1];
						count++;
					}
					{
						sum += M[i][j];
						count++;
					}
					if (j + 1 < M[i].length) {
						sum += M[i][j + 1];
						count++;
					}
				}
				// ROW3
				if (i + 1 < M.length) {
					if (j - 1 >= 0 && j - 1 < M[i + 1].length) {
						sum += M[i + 1][j - 1];
						count++;
					}
					if (j >= 0 && j < M[i + 1].length) {
						sum += M[i + 1][j];
						count++;
					}
					if (j + 1 >= 0 && j + 1 < M[i + 1].length) {
						sum += M[i + 1][j + 1];
						count++;
					}
				}
				temp[i][j] = sum / count;
			}
		}
		return temp;
	}
}