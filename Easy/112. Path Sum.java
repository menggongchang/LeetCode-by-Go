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

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		list = new ArrayList<Integer>();
		getPathSum(root, 0);

		return list.indexOf(sum) == -1 ? false : true;
	}

	private void getPathSum(TreeNode root, int tempSum) {
		tempSum += root.val;
		if (root.left == null && root.right == null) {
			list.add(tempSum);
			return;
		}
		if (root.left == null) {
			getPathSum(root.right, tempSum);
		} else if (root.right == null) {
			getPathSum(root.left, tempSum);
		} else {
			getPathSum(root.right, tempSum);
			getPathSum(root.left, tempSum);
		}
	}
}

