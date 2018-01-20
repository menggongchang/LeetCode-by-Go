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
	private List<Integer> list;

	public List<Integer> preorderTraversal(TreeNode root) {
		list = new ArrayList<Integer>();
		preOrder(root);
		return list;
	}

	private void preOrder(TreeNode root) {
		if (root == null)
			return;
		list.add(root.val);
		preOrder(root.left);
		preOrder(root.right);
	}

}