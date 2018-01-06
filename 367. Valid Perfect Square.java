
class Solution {
	public boolean isPerfectSquare(int num) {
		if (num == 0)
			return false;
		if (num == 1)
			return true;
		long left = 1, right = num;
		while (left <= right) {
			long mid = (left + right) / 2;
			long val = mid * mid;
			if (val < num) {
				left = mid + 1;
			} else if (val == num) {
				return true;
			} else {
				right = mid - 1;
			}
		}
		return false;
	}
}