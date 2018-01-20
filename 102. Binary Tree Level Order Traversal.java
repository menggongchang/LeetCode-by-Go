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
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null) {
			return list;
		}

		LinkedList<TreeNode> stack1 = new LinkedList<TreeNode>();
		LinkedList<TreeNode> stack2 = new LinkedList<TreeNode>();
		stack1.push(root);
		while (!stack1.isEmpty()) {
			ArrayList<Integer> array = new ArrayList<Integer>();
			TreeNode temp = null;
			while (!stack1.isEmpty()) {
				temp = stack1.pop();
				stack2.push(temp);
			}
			while (!stack2.isEmpty()) {
				temp = stack2.pop();
				array.add(temp.val);
				if (temp.left != null)
					stack1.push(temp.left);
				if (temp.right != null)
					stack1.push(temp.right);
			}
			list.add(array);
		}
		return list;
	}
}