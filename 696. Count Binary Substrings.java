import java.util.Arrays;

class Solution {
	public int countBinarySubstrings(String s) {
		int[] count = new int[s.length()];
		int index = 0;
		for (int i = 0; i < s.length(); i++, index++) {
			if (i == s.length() - 1) {
				count[index] = 1;
				break;
			}

			int j = i + 1;
			count[index] = 1;
			for (; j < s.length(); j++) {
				if (s.charAt(j) == s.charAt(i)) {
					count[index]++;
				} else {
					i = j - 1;
					break;
				}
			}
			if (j == s.length()) {
				i = j - 1;
				break;
			}
		}

		int sum = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i] == 0 || i == count.length - 1) {
				break;
			}
			if (count[i + 1] == 0) {
				break;
			} else {
				sum += Math.min(count[i], count[i + 1]);
			}
		}
		return sum;
	}
}