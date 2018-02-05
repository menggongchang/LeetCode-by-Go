class Solution {
	public String licenseKeyFormatting(String S, int K) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != '-') {
				sb.append(S.charAt(i));
			}
		}
		if (sb.length() <= K) {
			return sb.toString().toUpperCase();
		}
		sb.reverse();
		int length = sb.length() + (sb.length() - 1) / K;
		for (int i = K; i < length; i += K) {
			sb.insert(i, '-');
			i++;
		}
		return sb.reverse().toString().toUpperCase();
	}
}