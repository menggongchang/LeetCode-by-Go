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

	private ArrayList<Integer> list;

	public TreeNode convertBST(TreeNode root) {
		list = new ArrayList<Integer>();
		preOrder(root);
		convert(root);
		return root;
	}

	private void convert(TreeNode root) {
		if (root == null) {
			return;
		}

		int index = list.lastIndexOf(root.val);
		int sum = 0;
		for (int i = index + 1; i < list.size(); i++) {
			sum += list.get(i);
		}
		root.val += sum;

		convert(root.left);
		convert(root.right);
	}

	private void preOrder(TreeNode root) {
		if (root == null) {
			return;
		}

		preOrder(root.left);
		list.add(root.val);
		preOrder(root.right);
	}

}
