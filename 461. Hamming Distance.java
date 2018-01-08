class Solution {
	public int hammingDistance(int x, int y) {
		StringBuilder sbX = new StringBuilder(Integer.toBinaryString(x));
		StringBuilder sbY = new StringBuilder(Integer.toBinaryString(y));

		int lenX = sbX.length();
		int lenY = sbY.length();
		int len = lenX;
		if (lenX < lenY) {
			char[] zero = new char[lenY - lenX];
			for (int i = 0; i < zero.length; i++) {
				zero[i] = '0';
			}
			sbX.insert(0, zero);
			len = lenY;
		} else if (lenX > lenY) {
			char[] zero = new char[lenX - lenY];
			for (int i = 0; i < zero.length; i++) {
				zero[i] = '0';
			}
			sbY.insert(0, zero);
			len = lenX;
		}

		int distence = 0;
		for (int i = 0; i < len; i++) {
			if (sbX.charAt(i) != sbY.charAt(i)) {
				distence++;
			}
		}
		return distence;
	}
}