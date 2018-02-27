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

	ArrayList<String> list;

	public List<String> binaryTreePaths(TreeNode root) {
		list = new ArrayList<String>();
		if (root == null) {
			return list;
		}
		getPath(root, "");
		return list;
	}

	private void getPath(TreeNode root, String sb) {

		if (root.left == null && root.right == null) {
			list.add(sb + root.val);
			return;
		}

		sb = sb + root.val + "->";
		if (root.left == null) {
			getPath(root.right, sb);
		} else if (root.right == null) {
			getPath(root.left, sb);
		} else {
			getPath(root.right, sb);
			getPath(root.left, sb);
		}
	}
}