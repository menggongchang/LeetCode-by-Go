import java.util.HashMap;

class Solution {
	public int distributeCandies(int[] candies) {
		int sisterCandies = candies.length / 2;

		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int i : candies) {
			map.put(i, true);
		}

		int kinds = map.keySet().size();
		if (kinds <= sisterCandies) {
			return kinds;
		} else {
			return sisterCandies;
		}
	}
}