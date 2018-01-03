class Solution {
	public String reverseString(String s) {
		if (s.length() == 0) {
			return s;
		}

		char[] array = s.toCharArray();
		char temp;
		int i = 0;
		int j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(array);
	}
}