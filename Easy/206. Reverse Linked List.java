class Solution {
	public ListNode reverseList(ListNode head) {
		// 如果链表为空或者只有一个节点，无需反转，直接返回原链表的头结点
		if (head == null || head.next == null) {
			return head;
		}

		ListNode newHead = null;
		ListNode newNode = head;//
		ListNode next = null;
		while (newNode != null) {
			next = newNode.next;
			newNode.next = newHead;
			newHead = newNode;
			newNode = next;
		}
		return newHead;
	}
}