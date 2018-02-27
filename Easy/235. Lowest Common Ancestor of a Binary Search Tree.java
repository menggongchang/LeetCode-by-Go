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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.left == null) {
            if (p == root || q == root) {
                return root;
            } else {
                lowestCommonAncestor(root.right, p, q);
            }
        }
        if (root.right == null) {
            if (p == root || q == root) {
                return root;
            } else {
                lowestCommonAncestor(root.left, p, q);
            }
        }
        TreeNode l, r;
        if (p.val > q.val) {
            l = q;
            r = p;
        } else {
            l = p;
            r = q;
        }
        if (l.val <= root.val && r.val >= root.val) {
            return root;
        } else if (l.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return lowestCommonAncestor(root.left, p, q);
        }
    }
}