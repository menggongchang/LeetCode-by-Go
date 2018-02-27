class Solution {
	public boolean isSubtree(TreeNode s, TreeNode t) {
		return (s != null)
				&& (isEqual(s, t) || isSubtree(s.left, t) || isSubtree(s.right,
						t));
	}

	private boolean isEqual(TreeNode x, TreeNode y) {
		if (x == null && y == null) {
			return true;
		}
		if (x == null || y == null) {
			return false;
		}
		return (x.val == y.val) && isEqual(x.left, y.left)
				&& isEqual(x.right, y.right);
	}
}