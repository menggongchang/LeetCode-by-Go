class Solution {

	StringBuilder sb = new StringBuilder();
	public String tree2str(TreeNode t) {
		if (t == null) {
			return "";
		}
		preorder(t);
		return sb.toString();
	}

	private void preorder(TreeNode t) {
		sb.append(t.val);
		if (t.left == null && t.right != null) {
			sb.append("()");
			sb.append("(");
			preorder(t.right);
			sb.append(")");
		}
		if (t.left != null && t.right == null) {
			sb.append("(");
			preorder(t.left);
			sb.append(")");
		}
		if (t.left == null && t.right == null) {
			return;
		}
		if (t.left != null && t.right != null) {
			sb.append("(");
			preorder(t.left);
			sb.append(")");
			sb.append("(");
			preorder(t.right);
			sb.append(")");
		}
	}
}