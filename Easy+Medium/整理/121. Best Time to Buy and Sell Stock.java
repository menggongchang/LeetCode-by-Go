class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}

		int min = Integer.MAX_VALUE;// 记录前n个数中的最小值
		int max = Integer.MIN_VALUE;// 记录前n个数中的最大股票收益
		for (Integer i : prices) {
			if (i < min) {
				min = i;
			}
			if (i - min > max) {
				max = i - min;
			}
		}
		return max;
	}
}