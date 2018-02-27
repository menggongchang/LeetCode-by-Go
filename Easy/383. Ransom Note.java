import java.util.HashMap;

class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < magazine.length(); i++) {
			char key = magazine.charAt(i);
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}

		boolean canConstruct = true;
		for (int i = 0; i < ransomNote.length(); i++) {
			char key = ransomNote.charAt(i);
			if (map.containsKey(key)) {
				int number = map.get(key);
				if (number == 0) {
					canConstruct = false;
					break;
				} else {
					map.put(key, number - 1);
				}
			} else {
				canConstruct = false;
				break;
			}
		}
		return canConstruct;
	}
}