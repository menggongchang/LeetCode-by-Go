class Solution {
	public boolean isPowerOfThree(int n) {
		if (n == 0) {
			return false;
		}
		for (int i = 0; i < n; i++) {
			long temp = (long) Math.pow(3, i);
			if (temp == n) {
				return true;
			}
			if (temp > n) {
				return false;
			}
		}
		return false;
	}
}