class Solution {
	public boolean isPalindrome(String s) {
		if (s.length() == 0) {
			return true;
		}
		int i = 0, j = s.length() - 1;
		while (i < s.length() && j >= 0 && i < j) {
			char left = s.charAt(i);
			if (('0' <= left && left <= '9') || ('a' <= left && left <= 'z') || ('A' <= left && left <= 'Z')) {
			} else {
				i++;
				continue;
			}

			char right = s.charAt(j);
			if (('0' <= right && right <= '9') || ('a' <= right && right <= 'z') || ('A' <= right && right <= 'Z')) {
			} else {
				j--;
				continue;
			}

			if (left == right || (Math.max(left, right) >= 'a' && Math.min(left, right) >= 'A'
					&& Math.max(left, right) - Math.min(left, right) == 32)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		System.out.println(6);
		return true;
	}
}