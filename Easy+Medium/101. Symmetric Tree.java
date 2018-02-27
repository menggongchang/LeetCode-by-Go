import java.util.ArrayList;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
// recursively
class Solution1 {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		} else {
			return isMirror(root.left, root.right);
		}
	}

	public boolean isMirror(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return true;
		}
		if (t1 == null || t2 == null) {
			return false;
		}
		return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
	}
}

// iteratively
class Solution2 {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		} else {
			ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
			queue.add(root.left);
			queue.add(root.right);
			while (!queue.isEmpty()) {
				TreeNode l = queue.remove(0);
				TreeNode r = queue.remove(0);
				if (l == null && r == null) {
					continue;
				}
				if (l == null || r == null || l.val != r.val) {
					return false;
				}
				queue.add(l.left);
				queue.add(r.right);
				queue.add(l.right);
				queue.add(r.left);
			}
			return true;
		}
	}
}