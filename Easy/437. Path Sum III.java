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
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        } else {
            return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
        }
    }

    //路径包含node节点
    private int findPath(TreeNode node, int sum) {
        int res = 0;
        if (node == null) return 0;
        if (node.val == sum) res++;
        res += findPath(node.left, sum - node.val);
        res += findPath(node.right, sum - node.val);
        return res;
    }

}