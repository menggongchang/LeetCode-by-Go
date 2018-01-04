import java.util.ArrayList;

class Solution {

	private ArrayList<Character> list = new ArrayList<Character>();

	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		} else {
			String s = countAndSay(n - 1);
			for (int i = 0; i < s.length(); i++) {
				int count = 1;
				int j = i + 1;
				for (; j < s.length(); j++) {
					if (s.charAt(j) == s.charAt(i)) {
						count++;
					} else {
						break;
					}
				}
				i = j - 1;
				list.add((char) (count + '0'));// <=9
				list.add(s.charAt(i));
			}
			char[] chars = new char[list.size()];
			int i = 0;
			for (Character c : list) {
				chars[i++] = c;
			}
			list.clear();
			return String.valueOf(chars);
		}
	}
}