class Solution {

	private char[] word;

	public String reverseWords(String s) {
		if (s.length() == 0) {
			return s;
		}

		word = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			int j = i;
			while (j < s.length() && word[j] != ' ') {
				j++;
			}
			reverse(i, j - 1);
			i = j;
		}
		return String.valueOf(word);
	}

	private void reverse(int left, int right) {
		char temp;
		while (left < right) {
			temp = word[left];
			word[left] = word[right];
			word[right] = temp;
			left++;
			right--;
		}
	}

}