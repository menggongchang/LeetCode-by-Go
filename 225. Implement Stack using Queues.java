import java.util.LinkedList;

class MyStack {

	private LinkedList<Integer> back;
	private LinkedList<Integer> front;

	/** Initialize your data structure here. */
	public MyStack() {
		back = new LinkedList<>();
		front = new LinkedList<>();
	}

	/** Push element x onto stack. */
	public void push(int x) {
		front.push(x);
		while (!back.isEmpty()) {
			front.addLast(back.pollFirst());
		}
		LinkedList<Integer> temp = back;
		back = front;
		front = temp;
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		return back.pop();
	}

	/** Get the top element. */
	public int top() {
		return back.peek();
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return back.isEmpty() ? true : false;
	}
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */