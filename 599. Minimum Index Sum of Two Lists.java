class Solution {
	public String[] findRestaurant(String[] list1, String[] list2) {
		HashMap<String, Integer> map1 = new HashMap<>(list1.length);
		for (int i = 0; i < list1.length; i++) {
			map1.put(list1[i], i);
		}

		ArrayList<String> list = new ArrayList<>();
		int small = Integer.MAX_VALUE;
		for (int i = 0; i < list2.length; i++) {
			if (map1.containsKey(list2[i])) {
				int sum = i + map1.get(list2[i]);
				if (sum < small) {
                    small = sum;
					list.clear();
					list.add(list2[i]);
				} else if (sum == small) {
					list.add(list2[i]);
				}
			}
		}

		String[] result = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}
}