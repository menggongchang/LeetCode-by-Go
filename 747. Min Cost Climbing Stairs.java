//Wrong Answer
//感觉题目有问题？
class Solution {
	public int minCostClimbingStairs(int[] cost) {
		return Math.min(getMinimum(cost, 0), getMinimum(cost, 0));
	}

	private int getMinimum(int[] cost, int index) {
		if (index == cost.length - 1) {
			return 0;
		}
		if (index == cost.length - 2) {
			return cost[index];
		}
		return cost[index]
				+ Math.min(getMinimum(cost, index + 1),
						getMinimum(cost, index + 2));
	}
}

// Input:
// [0,0,1,1]
// Output:
// 0
// Expected:
// 1