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
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> result = new ArrayList<Double>();
		Queue<TreeNode> stack = new LinkedList<TreeNode>();
		if (root == null) {
			return result;
		} else {
			stack.add(root);
			while (!stack.isEmpty()) {
				double sum = 0.0;
				int n = stack.size();
				for (int i = 0; i < n; i++) {
					TreeNode node = stack.poll();
					sum += node.val;
					if (node.left != null) {
						stack.offer(node.left);
					}
					if (node.right != null) {
						stack.offer(node.right);
					}
				}
				result.add(sum / n);
			}
			return result;
		}
	}
}