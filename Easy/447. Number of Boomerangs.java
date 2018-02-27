class Solution {
	public static int numberOfBoomerangs(int[][] points) {
		int result = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < points.length; i++) {
			map.clear();
			for (int j = 0; j < points.length; j++) {
				if (i == j)
					continue;
				int distence = getDistance(points[i], points[j]);
				map.put(distence, map.getOrDefault(distence, 0) + 1);
			}
			for (int value : map.values()) {
				result += value * (value - 1);
			}
		}
		return result;
	}

	private static int getDistance(int[] point1, int[] point2) {
		int x = point1[0] - point2[0];
		int y = point1[1] - point2[1];
		return x * x + y * y;
	}
}