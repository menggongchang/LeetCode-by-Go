class Solution {
	public int maxCount(int m, int n, int[][] ops) {

		if (ops.length == 0) {
			return m * n;
		}

		int minA = ops[0][0];
		int minB = ops[0][1];
		for (int i = 0; i < ops.length; i++) {
			if (ops[i][0] < minA) {
				minA = ops[i][0];
			}
			if (ops[i][1] < minB) {
				minB = ops[i][1];
			}
		}
		return minA * minB;
	}
}