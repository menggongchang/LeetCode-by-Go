class Solution {
	public String addStrings(String num1, String num2) {
		// BigInteger big1 = new BigInteger(num1);
		// BigInteger big2 = new BigInteger(num2);
		// return big1.add(big2).toString();

		int add = 0; // 进位
		int left = num1.length(), right = num2.length();
		StringBuilder sb = new StringBuilder();
		while (left > 0 && right > 0) {
			add = add + num1.charAt(left - 1) - '0'
					+ (int) num2.charAt(right - 1) - '0';
			if (add <= 9) {
				sb.append(add);
				add = 0;
			} else {
				sb.append(add - 10);
				add = add / 10;
			}
			left--;
			right--;
		}
		while (left > 0) {
			add = add + num1.charAt(left - 1) - '0';
			if (add <= 9) {
				sb.append(add);
				add = 0;
			} else {
				sb.append(add - 10);
				add = add / 10;
			}
			left--;
		}
		while (right > 0) {
			add = add + num2.charAt(right - 1) - '0';
			if (add <= 9) {
				sb.append(add);
				add = 0;
			} else {
				sb.append(add - 10);
				add = add / 10;
			}
			right--;
		}
		if (add != 0) {
			sb.append(add);
			add = 0;
		}

		return sb.reverse().toString();
	}
}