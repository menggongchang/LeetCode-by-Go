public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		if (headA == headB) {
			return headA;
		}

		// 入栈
		Stack<ListNode> stack1 = new Stack<ListNode>();
		ListNode temp1 = headA;
		while (temp1 != null) {
			stack1.push(temp1);
			temp1 = temp1.next;
		}
		Stack<ListNode> stack2 = new Stack<ListNode>();
		ListNode temp2 = headB;
		while (temp2 != null) {
			stack2.push(temp2);
			temp2 = temp2.next;
		}
		// 出栈比较
		while (!stack1.empty() && !stack2.empty()) {
			temp1 = stack1.pop();
			temp2 = stack2.pop();
			if (temp1 != temp2) {
				return temp1.next;
			}
		}
		// 有一方先出栈
		if (stack1.empty()) {
			return temp1;
		} else {
			return temp2;
		}
	}
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		if (headA == headB) {
			return headA;
		}

		// 分别计算两个链表的长度
		int lenA = 0, lenB = 0;
		ListNode temp1 = headA;
		ListNode temp2 = headB;
		while (temp1 != null) {
			lenA++;
			temp1 = temp1.next;
		}
		while (temp2 != null) {
			lenB++;
			temp2 = temp2.next;
		}

		// 长链表走一段距离
		temp1 = headA;
		temp2 = headB;
		if (lenA > lenB) {
			int step = lenA - lenB;
			while (step > 0) {
				temp1 = temp1.next;
				step--;
			}
		} else if (lenA < lenB) {
			int step = lenB - lenA;
			while (step > 0) {
				temp2 = temp2.next;
				step--;
			}
		}

		while (temp1 != temp2) {
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return temp1;
	}
}