class Solution {
	public int strStr(String haystack, String needle) {

		int M = haystack.length();
		int N = needle.length();
		for (int i = 0; i <= M - N; i++) {
			int j;
			for (j = 0; j < N; j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
			}
			if (j == N) {
				return i;
			}
		}
		return -1;
	}
}


class Solution {
	public int strStr(String haystack, String needle) {

		// int M = haystack.length();
		// int N = needle.length();
		// for (int i = 0; i <= M - N; i++) {
		// int j;
		// for (j = 0; j < N; j++) {
		// if (haystack.charAt(i + j) != needle.charAt(j)) {
		// break;
		// }
		// }
		// if (j == N) {
		// return i;
		// }
		// }
		return KMP(haystack.toCharArray(), needle.toCharArray());
	}

	private int KMP(char[] s, char[] p) {

		int sLen = s.length;
		int pLen = p.length;
		if (pLen == 0) {
			return 0;
		}
		int[] next = getNext(p);
		int i = 0;
		int j = 0;
		while (i < sLen && j < pLen) {
			if (j == -1 || s[i] == p[j]) {
				i++;
				j++;
			} else {
				j = next[j];
			}
		}
		if (j == pLen) {
			return i - j;
		} else {
			return -1;
		}
	}

	private int[] getNext(char[] pattern) {
		int length = pattern.length;
		int[] next = new int[length];
		next[0] = -1;
		int k = -1;// k为最长匹配
		int j = 0;
		while (j < length - 1) {
			if (k == -1 || pattern[j] == pattern[k]) {
				k++;
				j++;
				next[j] = k;
			} else {
				k = next[k];
			}
		}
		return next;
	}
}