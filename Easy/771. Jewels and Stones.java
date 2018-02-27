import java.util.HashMap;
import java.util.Iterator;

class Solution {
	public int numJewelsInStones(String J, String S) {
		int number = 0;
		HashMap<Character, Integer> map = new HashMap<>(J.length());
		for (int i = 0; i < J.length(); i++) {
			map.put(J.charAt(i), 0);
		}
		for (int i = 0; i < S.length(); i++) {
			char a = S.charAt(i);
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			}
		}
		Iterator<Integer> i = map.values().iterator();
		while (i.hasNext()) {
			number += i.next();
		}
		return number;
	}
}