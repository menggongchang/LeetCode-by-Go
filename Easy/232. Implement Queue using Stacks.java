import java.util.Stack;

class MyQueue {

	private Stack<Integer> out;
	private Stack<Integer> in;

	/** Initialize your data structure here. */
	public MyQueue() {
		out = new Stack<>();
		in = new Stack<>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		in.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		if (!out.empty()) {
			return out.pop();
		} else if (!in.empty()) {
			while (!in.empty()) {
				out.push(in.pop());
			}
			return out.pop();
		} else {
			return -1;
		}
	}

	/** Get the front element. */
	public int peek() {
		if (!out.empty()) {
			return out.peek();
		} else if (!in.empty()) {
			while (!in.empty()) {
				out.push(in.pop());
			}
			return out.peek();
		} else {
			return -1;
		}
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return out.empty() && in.empty() ? true : false;
	}
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */