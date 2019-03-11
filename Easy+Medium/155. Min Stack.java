import java.util.LinkedList;

public class MinStack {
	/** initialize your data structure here. */
	private LinkedList<Integer> stack;
	private LinkedList<Integer> minStack;// 记录最小值

	public MinStack() {
		stack = new LinkedList<>();
		minStack = new LinkedList<>();
	}

	public void push(int x) {
		stack.push(x);
		if (minStack.isEmpty()) {
			minStack.push(x);
		} else if (minStack.peek() >= x) {
			minStack.push(x);
		}
	}

	public void pop() {
		if (!stack.isEmpty()) {
			int value = stack.pop();
			if (minStack.peek() == value) {
				minStack.pop();
			}
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
}
