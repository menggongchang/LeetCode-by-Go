import java.util.ArrayList;
import java.util.HashMap;

class Solution {
public boolean wordPattern(String pattern, String str) {
		ArrayList<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				list.add(sb.toString());
				sb.delete(0, sb.length());
			} else {
				sb.append(str.charAt(i));
			}
		}
		list.add(sb.toString());

		if (pattern.length() != list.size()) {
			return false;
		} else {
			HashMap<Character, String> map = new HashMap<>();
			for (int i = 0; i < pattern.length(); i++) {
				if (map.containsKey(pattern.charAt(i))) {
					if(!map.get(pattern.charAt(i)).equals(list.get(i))) {
						return false;
					}
				} else {
					if (map.values().contains(list.get(i))) {
						return false;
					} else {
						map.put(pattern.charAt(i), list.get(i));
					}
				}
			}
			return true;
		}
	}
}