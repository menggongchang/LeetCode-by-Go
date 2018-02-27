class Solution {

	private HashSet<Integer> set;

	public boolean findTarget(TreeNode root, int k) {
		set = new HashSet<Integer>();
		return find(root, k);
	}

	private boolean find(TreeNode root, int k) {
		if (root == null) {
			return false;
		}
		if (set.contains(k - root.val)) {
			return true;
		} else {
			set.add(root.val);
			return find(root.left, k) || find(root.right, k);
		}
	}
}