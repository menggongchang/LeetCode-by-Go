class Solution {
	public boolean hasAlternatingBits(int n) {
		int last = n % 2;
		n = n >>> 1;
		while (n != 0) {
			if (n % 2 == last) {
				return false;
			} else {
				last = n % 2;
				n = n >>> 1;
			}
		}
		return true;
	}
}