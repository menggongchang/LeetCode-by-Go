class Solution {
	public boolean judgeSquareSum(int c) {

		int j = (int) Math.sqrt(c);
		if (j * j == c) {
			return true;
		} else {
			int i = 1;
			while (i <= j) {
				if (i * i + j * j < c) {
					i++;
				} else if (i * i + j * j == c) {
					return true;
				} else {
					j--;
				}
			}
		}
		return false;

	}
}