class Solution {
	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int l = a.length();
		int r = b.length();
		int add = 0;// 进位
		while (l > 0 && r > 0) {
			add = add + (a.charAt(l - 1) - '0') + (b.charAt(r - 1) - '0');
			l--;
			r--;
			switch (add) {
			case 0:
			case 1:
				sb.append(add);
				add = 0;
				break;
			case 2:
				sb.append(0);
				add = 1;
				break;
			case 3:
				sb.append(1);
				add = 1;
				break;
			}
		}
		while (r > 0) {
			if (add == 0) {
				sb.append(b.charAt(r - 1));
			} else if (b.charAt(r - 1) == '0') {
				sb.append('1');
				add = 0;
			} else {
				sb.append('0');
				add = 1;
			}
			r--;
		}
		while (l > 0) {
			if (add == 0) {
				sb.append(a.charAt(l - 1));
			} else if (a.charAt(l - 1) == '0') {
				sb.append('1');
				add = 0;
			} else {
				sb.append('0');
				add = 1;
			}
			l--;
		}
		if (add == 1) {
			sb.append('1');
			add = 0;
		}
		return sb.reverse().toString();
	}
}