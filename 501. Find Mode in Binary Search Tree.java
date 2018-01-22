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

    private HashMap<Integer, Integer> map;

    public int[] findMode(TreeNode root) {
        map = new HashMap<>();
        inOrder(root);

        int max = Integer.MIN_VALUE;
        Iterator<Integer> i = map.values().iterator();
        while (i.hasNext()) {
            max = Math.max(max, i.next());
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer j : map.keySet()) {
            if (map.get(j) == max) {
                list.add(j);
            }
        }

        int[] result = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }
        
        return result;
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        inOrder(root.right);
    }

}