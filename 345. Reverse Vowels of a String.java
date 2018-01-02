class Solution {
	public String reverseVowels(String s) {
		if (s.length() == 0) {
			return s;
		}

		char[] chars = s.toCharArray();
		int i = 0, j = s.length() - 1;
		while (i < j && i < s.length() && j >= 0) {
			while (chars[i] != 'a' && chars[i] != 'e' && chars[i] != 'i'
					&& chars[i] != 'o' && chars[i] != 'u' && chars[i] != 'A'
					&& chars[i] != 'E' && chars[i] != 'I' && chars[i] != 'O'
					&& chars[i] != 'U') {
				i++;
				if (i == s.length()) {
					break;
				}
			}
			while (chars[j] != 'a' && chars[j] != 'e' && chars[j] != 'i'
					&& chars[j] != 'o' && chars[j] != 'u' && chars[j] != 'A'
					&& chars[j] != 'E' && chars[j] != 'I' && chars[j] != 'O'
					&& chars[j] != 'U') {
				j--;
				if (j == -1) {
					break;
				}
			}
			if (i < j && i < s.length() && j >= 0) {
				char temp = chars[i];
				chars[i] = chars[j];
				chars[j] = temp;
				i++;
				j--;
			}
		}
		return String.valueOf(chars);
	}
}