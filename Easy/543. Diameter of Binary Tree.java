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
    
    private int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        if(max==0 || max==1){
            return 0;
        }else{
            return max-1;
        }
    }
    
    private int getDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        max = Math.max(max,left+1+right);
        return 1+Math.max(left,right);
    }
}