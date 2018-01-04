import java.util.Stack;

class Solution {
	public boolean isValid(String s) {
		if (s.length() == 0) {
			return true;
		}
		if (s.length() % 2 == 1) {
			return false;
		}
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			left.push(s.charAt(i));
		}
		while (!left.empty()) {
			char temp1 = left.pop();
			if (right.empty()) {
				right.push(temp1);
			} else {
				char temp2 = right.pop();
				if ((temp1 == '(' && temp2 == ')')
						|| (temp1 == '{' && temp2 == '}')
						|| (temp1 == '[' && temp2 == ']')) {
				} else {
					right.push(temp2);
					right.push(temp1);
				}
			}
		}
		if (right.empty()) {
			return true;
		} else {
			return false;
		}
	}
}