class Solution {
	public boolean checkRecord(String s) {
		if (s.indexOf("LLL") >= 0) {
			return false;
		}

		int ANum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				ANum++;
			}
			if (ANum > 1) {
				return false;
			}
		}
		return true;
	}
}