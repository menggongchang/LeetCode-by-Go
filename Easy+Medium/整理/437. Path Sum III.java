/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	public int pathSum(TreeNode root, int sum) {
		int number = 0;
		if (root == null) {
			return number;
		}
		number = findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
		return number;
	}

	//node在路径上·
	private int findPath(TreeNode node, int sum) {
		if (node == null) {
			return 0;
		}
		int res = 0;
		if (node.val == sum) {
			res++;
		}
		res += findPath(node.left, sum - node.val);
		res += findPath(node.right, sum - node.val);
		return res;
	}
}