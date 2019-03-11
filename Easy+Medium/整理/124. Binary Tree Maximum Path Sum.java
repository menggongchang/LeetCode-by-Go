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
	private int max;

	public int maxPathSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		max = root.val;
		getDepthSum(root);
		return max;
	}

	private int getDepthSum(TreeNode node) {
		if (node == null) {
			return 0;
		}

		int left = Math.max(0, getDepthSum(node.left));
		int right = Math.max(0, getDepthSum(node.right));
		max = Math.max(max, node.val + left + right);
		return node.val + Math.max(left, right);
	}
}