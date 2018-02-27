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

	private int sum = 0;

	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 0;
		}

		LeftLeaves(root);
		return sum;
	}

	private void LeftLeaves(TreeNode root) {
		if (root.left != null) {
			if (root.left.left == null && root.left.right == null) {
				sum += root.left.val;
			} else {
				LeftLeaves(root.left);
			}
		}

		if (root.right != null) {
			if (root.right.left == null && root.right.right == null) {
				return;// 右叶子
			} else {
				LeftLeaves(root.right);
			}
		}
	}
}