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

	public List<Integer> postorderTraversal(TreeNode root) {
		list = new ArrayList<Integer>();
		postOrder(root);
		return list;
	}

	private void postOrder(TreeNode root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		list.add(root.val);
	}
}