class Solution {
	public int compress(char[] chars) {

		int k = 0;

		for (int i = 0; i < chars.length; i++) {
			int j = i + 1;
			int num = 1;
			while (j < chars.length && chars[i] == chars[j]) {
				num++;
				j++;
			}
			if (j == i + 1) {
				chars[k++] = chars[i];
			} else {
				chars[k++] = chars[i];
				if (num > 9) {
					String temp = String.valueOf(num);
					for (int m = 0; m < temp.length(); m++) {
						chars[k++] = temp.charAt(m);
					}
				} else {
					chars[k++] = (char) (num + '0');
				}
			}
			i = j - 1;
		}
		return k;
	}
}