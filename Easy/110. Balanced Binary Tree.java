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
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		int differ = getHight(root.left) - getHight(root.right);
		if (differ >= -1 && differ <= 1) {
			return isBalanced(root.left) && isBalanced(root.right);
		} else {
			return false;
		}
	}

	private int getHight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(getHight(root.left), getHight(root.right));
	}
}