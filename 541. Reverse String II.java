class Solution {

	private char[] words;

	public String reverseStr(String s, int k) {
		int sLen = s.length();

		words = s.toCharArray();
		for (int i = 0; i < sLen; i++) {
			if (sLen - i <= k) {
				reverse(i, sLen - 1);
				break;
			}
			if (sLen - i <= 2 * k) {
				reverse(i, i + k - 1);
				break;
			}
			reverse(i, i + k - 1);
			i = i + 2 * k - 1;
		}
		return String.valueOf(words);
	}

	private void reverse(int left, int right) {
		char temp;
		while (left < right) {
			temp = words[left];
			words[left] = words[right];
			words[right] = temp;
            left++;
            right--;
		}
	}
}