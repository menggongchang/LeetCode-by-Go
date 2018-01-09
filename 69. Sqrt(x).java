class Solution {
	public int mySqrt(int x) {
		if (x == 0 || x == 1) {
			return x;
		}

		long low = 1;
		long high = x / 2;
		while (low <= high) {
			long mid = (low + high) / 2;
			long square = mid * mid;
			if (square == x) {
				return (int) mid;
			} else if (square < x) {
				low = mid + 1;
				if (low * low > x) {
					return (int) mid;
				}
			} else {
				high = mid - 1;
				if (high * high < x) {
					return (int) high;
				}
			}
		}
		return -1;
	}
}