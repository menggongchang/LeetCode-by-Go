class Solution {
	public int addDigits(int num) {
		if (num <= 9) {
			return num;
		}
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		while (num > 9) {
			sb.append(num);
			sum = 0;
			for (int i = 0; i < sb.length(); i++) {
				sum += (sb.charAt(i) - '0');
			}
			num = sum;
			sb.delete(0, sb.length());
		}
		return num;
	}
}