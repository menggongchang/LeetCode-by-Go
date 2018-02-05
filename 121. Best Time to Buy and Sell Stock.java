// Time Limit Exceeded
//class Solution {
//	public int maxProfit(int[] prices) {
//		int N = prices.length;
//		if (N <= 1) {
//			return 0;
//		}
//
//		int max = 0;
//		int temp;
//		for (int i = 0; i < N; i++) {
//			for (int j = i + 1; j < N; j++) {
//				temp = prices[j] - prices[i];
//				if (temp > max) {
//					max = temp;
//				}
//			}
//		}
//		return max;
//	}
//}

//pass 
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solution/
class Solution {
	public int maxProfit(int[] prices) {
		int N = prices.length;
		if (N <= 1) {
			return 0;
		}

		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i < N; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else if (prices[i] - minPrice > maxProfit) {
				maxProfit = prices[i] - minPrice;
			}
		}
		return maxProfit;
	}
}