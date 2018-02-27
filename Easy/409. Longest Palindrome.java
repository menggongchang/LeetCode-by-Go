class Solution {
	public int longestPalindrome(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), 1 + map.getOrDefault(s.charAt(i), 0));
		}

		ArrayList<Integer> list = new ArrayList<>(map.values());
		Collections.sort(list);
		int longest = 0;
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 != 0) {
				longest += list.get(i);
				index = i;
				break;
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (i == index) {
				continue;
			}
			int temp = list.get(i);
			if (temp % 2 == 0) {
				longest += temp;
			} else {
				longest += (temp - 1);
			}
		}
		return longest;
	}
}