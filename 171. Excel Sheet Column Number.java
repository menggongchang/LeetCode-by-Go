class Solution {
	public int titleToNumber(String s) {
		int N = s.length();
		if (N == 0) {
			return 0;
		}
		if (N == 1) {
			return s.charAt(0) - 'A' + 1;
		}
		int result = 0;
		for (int i = 0; i < N; i++) {
			result += (s.charAt(i) - 'A' + 1) * Math.pow(26, N - 1 - i);
		}
		return result;
	}
}