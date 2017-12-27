//https://leetcode.com/problems/degree-of-an-array/solution/

import java.util.HashMap;

class Solution {
	public int findShortestSubArray(int[] nums) {
		int N = nums.length;

		HashMap<Integer, Integer> left = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> right = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {
			if (!left.containsKey(nums[i])) {
				left.put(nums[i], i);
				right.put(nums[i], i);
				count.put(nums[i], 1);
			} else {
				right.put(nums[i], i);
				count.put(nums[i], count.get(nums[i]) + 1);
			}
		}

		// 计算degree
		int degree = 0;
		for (int time : count.values()) {
			if (time > degree) {
				degree = time;
			}
		}
		// 计算长度
		int length = N;
		for (int key : count.keySet()) {
			if (count.get(key) == degree) {
				int tempLength = right.get(key) - left.get(key) + 1;
				if (tempLength < length) {
					length = tempLength;
				}
			}
		}
		return length;
	}
}