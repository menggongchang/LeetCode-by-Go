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

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		Stack<Integer> stack = new Stack<>();
		getPath(root, sum, list, stack);
		return list;

	}

	private void getPath(TreeNode node, int value, List<List<Integer>> list, Stack<Integer> stack) {
		value -= node.val;
		stack.push(node.val);
		if (node.left == null && node.right == null) {
			if (value == 0) {
				list.add(new ArrayList<>(stack));
			}
			stack.pop();
			return;
		}

		if (node.left == null) {
			getPath(node.right, value, list, stack);
		} else if (node.right == null) {
			getPath(node.left, value, list, stack);
		} else {
			getPath(node.left, value, list, stack);
			getPath(node.right, value, list, stack);
		}
		stack.pop();
	}
}