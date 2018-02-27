//https://leetcode.com/problems/minimum-moves-to-equal-array-elements/discuss/93815/
class Solution {
	public int minMoves(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			min = nums[i] < min ? nums[i] : min;
		}
		int move = 0;
		for (int i = 0; i < nums.length; i++) {
			move += (nums[i] - min);
		}
		return move;
	}
}