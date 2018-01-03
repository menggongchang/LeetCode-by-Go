class Solution {
	public void deleteNode(ListNode node) {
		// 最后一个节点
		if (node.next == null) {
			return;
		}
		// 倒数第二个节点
		if (node.next.next == null) {
			node.val = node.next.val;
			node.next = null;
			return;
		}
		// 其他节点
		ListNode temp = node;
		while (temp.next.next != null) {
			temp.val = temp.next.val;
			temp = temp.next;
		}
		temp.val = temp.next.val;
		temp.next = null;
		return;
	}
}