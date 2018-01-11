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
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) {
			return null;
		} else {
			return ArrayToBST(nums, 0, nums.length - 1);
		}

	}

	public TreeNode ArrayToBST(int[] nums, int l, int r) {
		if (r < l) {
			return null;
		} else if (l == r) {
			return new TreeNode(nums[l]);
		} else {
			int mid = (l + r) / 2;
			TreeNode root = new TreeNode(nums[mid]);
			root.left = ArrayToBST(nums, l, mid - 1);
			root.right = ArrayToBST(nums, mid + 1, r);
			return root;
		}
	}
}