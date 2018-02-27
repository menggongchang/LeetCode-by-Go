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
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return -1;
        }
        return firstMax(root, root.val);
    }

    private int firstMax(TreeNode root, int value) {
        if (root.val > value) {
            return root.val;
        } else if (root.left == null && root.right == null) {
            return -1;
        } else {
            int l = firstMax(root.left, value);
            int r = firstMax(root.right, value);
            if (l != -1 && r != -1) {
                return Integer.min(l, r);
            } else {
                return Integer.max(l, r);
            }
        }
    }

}