class Solution {
	public int countPrimeSetBits(int L, int R) {
		int count = 0;
		for (int i = L; i <= R; i++) {
			if (isPrime(numOfOne(i))) {
				count++;
			}
		}
		return count;
	}

	private boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2 || n == 3) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	private int numOfOne(int n) {
		int num = 0;
		while (n != 0) {
			if (n % 2 != 0) {
				num++;
			}
			n = n >> 1;
		}
		return num;
	}
}