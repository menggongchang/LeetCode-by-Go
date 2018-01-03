class Solution {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return head;
		}
		while (head.val == val) {
			head = head.next;
			if (head == null) {
				return head;
			}
		}

		ListNode temp1 = head;
		ListNode temp2 = head.next;
		while (temp2 != null) {
			if (temp2.val == val) {
				temp2 = temp2.next;
				temp1.next = temp2;
			} else {
				temp1 = temp2;
				temp2 = temp2.next;
			}
		}
		return head;
	}
}