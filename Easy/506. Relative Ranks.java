class Solution {
	public String[] findRelativeRanks(int[] nums) {
		int N = nums.length;

		// 1记录位置
		HashMap<Integer, Integer> map = new HashMap<>(N);
		for (int i = 0; i < N; i++) {
			map.put(nums[i], i);
		}

		// 2 排序
		Arrays.sort(nums);

		// 3
		String[] result = new String[N];
		for (int i = 0; i < N; i++) {
			int index = map.get(nums[N - 1 - i]);
			switch (i) {
			case 0:
				result[index] = "Gold Medal";
				break;
			case 1:
				result[index] = "Silver Medal";
				break;
			case 2:
				result[index] = "Bronze Medal";
				break;
			default:
				result[index] = String.valueOf(i + 1);
				break;
			}
		}
		return result;
	}
}