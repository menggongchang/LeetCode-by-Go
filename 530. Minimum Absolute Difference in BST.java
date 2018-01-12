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

	public int getMinimumDifference(TreeNode root) {
		list = new ArrayList<Integer>();
		preOrder(root);

		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < list.size() - 1; i++) {
			int differ = Math.abs(list.get(i) - list.get(i + 1));
			if (differ < diff) {
				diff = differ;
			}
		}
		return diff;
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