class Solution {
	public int[] anagramMappings(int[] A, int[] B) {

		int len = A.length;
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>(len);
		for (int i = 0; i < len; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			if (map.containsKey(B[i])) {
				temp = map.get(B[i]);
				temp.add(i);
				map.put(B[i], temp);
			} else {
				temp.add(i);
				map.put(B[i], temp);
			}
		}

		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			ArrayList<Integer> temp = map.get(A[i]);
			if (temp.size() == 1) {
				result[i] = temp.get(0);
			} else {
				result[i] = temp.get(0);
				temp.remove((Object) result[i]);
				map.put(A[i], temp);
			}
		}
		return result;
	}
}