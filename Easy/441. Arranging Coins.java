class Solution {
	public int arrangeCoins(int n) {
		if (n == 0) {
			return 0;
		}
		return (int) (Math.sqrt(8.0 * n + 1.0) - 1) / 2;
	}
}