class Solution {
	public String convertToBase7(int num) {
		char sign = '+';
		if (num < 0) {
			sign = '-';
			num = -num;
		}
		StringBuilder sb = new StringBuilder();
		while (num > 6) {
			sb.append(num % 7);
			num = num / 7;
		}
		sb.append(num);
		if (sign == '-') {
			sb.append(sign);
		}
		return sb.reverse().toString();
	}
}