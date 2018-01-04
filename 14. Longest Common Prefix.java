class Solution {
	public String longestCommonPrefix(String[] strs) {

		if (strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0];

		StringBuilder sb = new StringBuilder();
		Character temp = null;
		for (int i = 0;; i++) {
			for (int j = 0; j < strs.length; j++) {
				if (i >= strs[j].length()) {
					return sb.toString();
				} else if (temp == null) {
					temp = strs[j].charAt(i);
				} else if (temp != strs[j].charAt(i)) {
					return sb.toString();
				}
			}
			sb.append(temp);
			temp = null;
		}
	}
}