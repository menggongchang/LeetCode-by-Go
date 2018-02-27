class Solution {
	public char nextGreatestLetter(char[] letters, char target) {
		char larger = target;
		for (char c : letters) {
			if (c > target) {
				larger = c;
				break;
			}
		}
		if (larger == target) {
			return letters[0];
		} else {
			return larger;
		}
	}
}