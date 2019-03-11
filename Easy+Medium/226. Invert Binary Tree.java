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
	//递归法
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode temp = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(temp);
		return root;
	}


	//迭代法
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}

		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.addFirst(root);
		TreeNode node, temp = null;
		while (!queue.isEmpty()) {
			node = queue.removeLast();
			temp = node.left;
			node.left = node.right;
			node.right = temp;
			if (node.left != null) {
				queue.addFirst(node.left);
			}
			if (node.right != null) {
				queue.addFirst(node.right);
			}
		}
		node = null;
		temp = null;
		return root;
	}
}