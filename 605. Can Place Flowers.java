class Solution {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {

		int N = flowerbed.length;

		if (N == 0) {
			return false;
		}

		if (N == 1) {
			if (flowerbed[0] == 0 && n <= 1) {
				return true;
			}
			if (flowerbed[0] == 1 && n <= 0) {
				return true;
			}
			return false;
		}

		for (int i = 1; i < N; i++) {
			if (n == 0) {
				break;
			}
			if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
				if (i == 1) {
					n--;// index=0位置种花
				} else if (i == N - 1) {
					n--;// index=N - 1位置种花
				} else if (flowerbed[i + 1] == 0) {
					n--;// index=i位置种花
					i++;
				}
			}
		}

		if (n == 0) {
			return true;
		} else {
			return false;
		}
	}
}