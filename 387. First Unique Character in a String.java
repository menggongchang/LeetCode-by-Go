import java.util.HashMap;

class Solution {

	private char key;

	public int firstUniqChar(String s) {

		int sLen = s.length();
		if (sLen == 0) {
			return -1;
		}
		if (sLen == 1) {
			return 0;
		}

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < sLen; i++) {
			key = s.charAt(i);
			if (map.containsKey(key)) {
				map.put(key, 2);
			} else {
				map.put(key, 1);
			}
		}
		if (map.values().contains(1)) {
			for (int i = 0; i < sLen; i++) {
				key = s.charAt(i);
				if (map.get(key) == 1) {
					return i;
				}
			}
		} else {
			return -1;
		}
		return -1;
	}
}