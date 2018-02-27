class Solution {
	public int repeatedStringMatch(String A, String B) {
		StringBuilder sb = new StringBuilder(A);
		int count = 1;
		while (sb.length() < B.length()) {
			sb.append(A);
			count++;
		}
		if (sb.indexOf(B) != -1) {
			return count;
		}
		sb.append(A);
		count++;
		if (sb.indexOf(B) != -1) {
			return count;
		} else {
			return -1;
		}
	}
}