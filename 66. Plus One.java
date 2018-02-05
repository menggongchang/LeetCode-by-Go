class Solution {
	public int[] plusOne(int[] digits) {

		int N = digits.length;
		int add = 1;
		for (int i = N - 1; i >= 0; i--) {
			if (add == 0) {
				break;
			}
			if (digits[i] < 9) {
				digits[i]++;
				add = 0;
			} else {
				digits[i] = 0;
				add = 1;
			}
		}

		if (add == 0) {
			return digits;
		} else {
			int[] newDigits = new int[N + 1];
			newDigits[0] = 1;
			System.arraycopy(digits, 0, newDigits, 1, N);
			return newDigits;
		}
	}
}