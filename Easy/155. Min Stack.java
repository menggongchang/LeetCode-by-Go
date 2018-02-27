class MinStack {

	private ListNode top;
	private ListNode small;

	/** initialize your data structure here. */
	public MinStack() {
		top = null;
		small = null;
	}

	public void push(int x) {
		ListNode temp = new ListNode();
		temp.value = x;
		temp.next = top;
		top = temp;

		if (small == null || top.value < small.value) {
			small = top;
		}
	}

	public void pop() {
		if (top == null) {
			return;
		}
		if (top.next == null) {
			top = null;
			small = null;
			return;
		}

		ListNode temp = top;
		top = top.next;
		temp.next = null;

		if (small == temp) {
			temp = top;
			small = top;
			while (temp != null) {
				if (temp.value < small.value) {
					small = temp;
				}
				temp = temp.next;
			}
		}
	}

	public int top() {
		return top.value;
	}

	public int getMin() {
		return small.value;
	}

	class ListNode {
		int value;
		ListNode next;
	}
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */