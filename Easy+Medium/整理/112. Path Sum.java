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

	private boolean find = false;

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		getPathSum(root, sum);
		return find;
	}

	private void getPathSum(TreeNode root, int value) {
		if (find) {
			return;// 终止
		}
		value -= root.val;
		if (root.left == null && root.right == null) {
			if (value == 0) {
				find = true;
			}
			return;
		}
		if (root.left == null) {
			getPathSum(root.right, value);
		} else if (root.right == null) {
			getPathSum(root.left, value);
		} else {
			getPathSum(root.left, value);
			getPathSum(root.right, value);
		}
	}

}
