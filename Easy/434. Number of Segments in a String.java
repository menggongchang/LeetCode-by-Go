class Solution {
	public int countSegments(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				continue;
			} else {
				int j = i + 1;
				while (j < s.length() && s.charAt(j) != ' ') {
					j++;
				}
				count++;
				i = j;
			}
		}

		return count;
	}
}
