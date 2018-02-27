import java.util.ArrayList;
import java.util.HashMap;

class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {

		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums1.length; i++) {
			if (!map1.containsKey(nums1[i])) {
				map1.put(nums1[i], 1);
			} else {
				map1.put(nums1[i], 1 + map1.get(nums1[i]));
			}
		}
		for (int i = 0; i < nums2.length; i++) {
			if (!map2.containsKey(nums2[i])) {
				map2.put(nums2[i], 1);
			} else {
				map2.put(nums2[i], 1 + map2.get(nums2[i]));
			}
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int key : map1.keySet()) {
			int number1 = 0;
			int number2 = 0;
			if (map2.containsKey(key)) {
				number1 = map1.get(key);
				number2 = map2.get(key);
				for (int i = 0; i < Math.min(number1, number2); i++) {
					list.add(key);
				}
			} else {
				continue;
			}
		}

		int[] result = new int[list.size()];
		int index = 0;
		for (int x : list) {
			result[index++] = x;
		}
		return result;
	}
}