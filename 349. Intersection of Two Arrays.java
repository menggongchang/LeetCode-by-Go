import java.util.HashMap;

class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums1.length; i++) {
			map1.put(nums1[i], i);
		}

		for (int i = 0; i < nums2.length; i++) {
			if (map1.containsKey(nums2[i])) {
				map2.put(nums2[i], i);
			}
		}
		int[] result = new int[map2.keySet().size()];
		int i = 0;
		for (int x : map2.keySet()) {
			result[i++] = x;
		}
		return result;
	}
}