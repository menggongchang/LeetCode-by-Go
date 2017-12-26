/*
 * 思路参考
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/solution/
 */
class Solution {
	public int maxProfit(int[] prices) {
		int N = prices.length;

		if (N <= 1) {
			return 0;
		}

		int valley = prices[0];// 谷值
		int peak = prices[0];// 峰值
		int maxProfit = 0;
		int i = 0;
		while (i < N) {
			while (i < N - 1 && prices[i] >= prices[i + 1]) {
				i++;
			}
			valley = prices[i];

			while (i < N - 1 && prices[i] <= prices[i + 1]) {
				i++;
			}
			peak = prices[i];
			i++;
			maxProfit += (peak - valley);
		}

		return maxProfit;
	}
}