/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}

		// 计算中间节点
		int length = 0;
		ListNode node = head;
		while (node != null) {
			length++;
			node = node.next;
		}
		int index = length / 2;

		// 将一个链表从中间截断，构造成两个链表
		ListNode p1 = head, p2;
		for (int i = 0; i < index; i++) {
			p1 = p1.next;
		}
		// 偶数个
		if (length % 2 == 0) {
			p2 = p1;// 新联表的头部
		} else {
			p2 = p1.next;// 新联表的头部
		}
		ListNode newNode = p2.next;
		ListNode temp1, temp2;
		while (newNode != null) {
			temp1 = p2;
			temp2 = newNode.next;
			p2 = newNode;
			p2.next = temp1;
			newNode = temp2;
		}

		p1 = head;
		for (int i = 0; i < index; i++) {
			if (p1.val != p2.val) {
				return false;
			} else {
				p1 = p1.next;
				p2 = p2.next;
			}
		}
		return true;
	}
}