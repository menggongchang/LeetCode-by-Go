class Solution {
	public int findContentChildren(int[] g, int[] s) {
		if (s.length == 0) {
			return 0;
		}

		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < s.length; i++) {
			map.put(s[i], map.getOrDefault(s[i], 0) + 1);
		}

		Arrays.sort(g);
		int output = 0;

		for (int i = g.length - 1; i >= 0; i--) {
			if (map.size() == 0) {
				return output;
			}
			Integer maxVal = map.lastKey();
			int num = map.get(maxVal);
			if (maxVal >= g[i]) {
				output++;
				if (num == 1) {
					map.pollLastEntry();
				} else {
					map.put(maxVal, num - 1);
				}
			}
		}

		return output;
	}
}