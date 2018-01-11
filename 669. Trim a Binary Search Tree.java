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
	public TreeNode trimBST(TreeNode root, int L, int R) {
		if (root == null) {
			return root;
		}
		if (root.val < L) {
			return trimBST(root.right, L, R);
		}
		if (root.val > R) {
			return trimBST(root.left, L, R);
		}
		deleteLeft(root, L);
		deleteRight(root, R);
		return root;
	}

	private void deleteLeft(TreeNode root, int L) {
		if (root.left == null) {
			return;
		} else if (root.left.val >= L) {
			deleteLeft(root.left, L);
		} else {
			root.left = root.left.right;
			deleteLeft(root, L);
		}
	}

	private void deleteRight(TreeNode root, int R) {
		if (root.right == null) {
			return;
		} else if (root.right.val <= R) {
			deleteRight(root.right, R);
		} else {
			root.right = root.right.left;
			deleteRight(root, R);
		}
	}
}