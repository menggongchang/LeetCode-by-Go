import java.util.ArrayList;
import java.util.HashMap;

class Solution {
	public String[] findWords(String[] words) {

		String[] strs = new String[] { "QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM" };
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < strs.length; i++) {
			for (char c : strs[i].toCharArray()) {
				map.put(c, i);
			}
		}

		ArrayList<String> list = new ArrayList<String>();
		for (String s : words) {
			if (s.length() == 0) {
				continue;
			}

			int index = map.get(s.toUpperCase().charAt(0));
			for (char c : s.toUpperCase().toCharArray()) {
				if (map.get(c) != index) {
					index = -1;
					break;
				}
			}

			if (index != -1) {
				list.add(s);
			}
		}
		return list.toArray(new String[0]);
	}
}