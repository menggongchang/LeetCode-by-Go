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
    private int max;

    public int longestUnivaluePath(TreeNode root) {
        max = 0;
        allowLength(root);
        return max;
    }

    private int allowLength(TreeNode node) {
        if (node == null) return 0;
        int left = allowLength(node.left);
        int right = allowLength(node.right);
        int allowLeft = 0;
        int allowRight = 0;
        if (node.left != null && node.left.val == node.val) {
            allowLeft = left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            allowRight = right + 1;
        }
        max = Integer.max(max, allowLeft + allowRight);
        return Integer.max(allowLeft, allowRight);
    }

}