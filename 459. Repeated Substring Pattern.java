class Solution {
	public boolean repeatedSubstringPattern(String s) {

		int sLen = s.length();
		if (sLen == 1) {
			return false;
		} else {
			StringBuilder sb = new StringBuilder();
			for (int i = sLen / 2; i > 0; i--) {// i表示子串的长度
				if (sLen % i == 0) {
					sb.delete(0, sb.length());
					sb.append(s.substring(0, i));
					int k = i;
					for (; k < sLen; k += i) {
						if (!sb.toString().equals(s.substring(k, k + i))) {
							break;
						}
					}
					if (k == sLen) {
						return true;
					}
				}
			}
			return false;
		}
	}
}