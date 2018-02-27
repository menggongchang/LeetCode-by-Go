import java.util.ArrayDeque;

class Solution {
	public int calPoints(String[] ops) {
		ArrayDeque<String> stack = new ArrayDeque<String>();
		for (String s : ops) {
			if (s.equalsIgnoreCase("+")) {
				String point1 = stack.removeFirst();
				String point2 = stack.getFirst();
				int point = Integer.parseInt(point1) + Integer.parseInt(point2);
				stack.addFirst(point1);
				stack.addFirst(String.valueOf(point));
			} else if (s.equalsIgnoreCase("D")) {
				int point = 2 * Integer.parseInt(stack.getFirst());
				stack.addFirst(String.valueOf(point));
			} else if (s.equalsIgnoreCase("C")) {
				stack.removeFirst();
			} else {
				stack.addFirst(s);
			}
		}
		int sum = 0;
		while (stack.size() != 0) {
			sum += Integer.parseInt(stack.removeFirst());
		}
		return sum;
	}
}