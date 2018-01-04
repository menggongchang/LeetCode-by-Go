class Solution {
	public int romanToInt(String s) {
		int number = 0;
		for (int i = 0; i < s.length(); i++) {
			int j = i + 1;
			switch (s.charAt(i)) {
			case 'I':// 1-
				if (j < s.length()) {
					switch (s.charAt(j)) {
					case 'V':
						number += 4;i++;break;
					case 'X':
						number += 9;i++;break;
					case 'L':
						number += 49;i++;break;
					case 'C':
						number += 99;i++;break;
					case 'D':
						number += 499;i++;break;
					case 'M':
						number += 999;i++;break;
					default:
						number += 1;
						break;
					}
				} else {
					number += 1;
				}
				break;
			case 'V':// 5
				number += 5;
				break;
			case 'X':// 10-
				if (j < s.length()) {
					switch (s.charAt(j)) {
					case 'L':
						number += 40;i++;break;
					case 'C':
						number += 90;i++;break;
					case 'D':
						number += 490;i++;break;
					case 'M':
						number += 990;i++;break;
					default:
						number += 10;
						break;
					}
				} else {
					number += 10;
				}
				break;
			case 'L':// 50
				number += 50;
				break;
			case 'C':// 100-
				if (j < s.length()) {
					switch (s.charAt(j)) {
					case 'D':
						number += 400;i++;break;
					case 'M':
						number += 900;i++;break;
					default:
						number += 100;
						break;
					}
				} else {
					number += 100;
				}
				break;
			case 'D':// 500
				number += 500;
				break;
			case 'M':// 1000
				number += 1000;
				break;
			default:
				break;
			}
		}
		return number;
	}
}