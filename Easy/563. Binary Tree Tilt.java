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
	public int findTilt(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.abs(getNodeSum(root.left) - getNodeSum(root.right)) + findTilt(root.left) + findTilt(root.right);
	}

	private int getNodeSum(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return root.val + getNodeSum(root.left) + getNodeSum(root.right);
		}
	}
}