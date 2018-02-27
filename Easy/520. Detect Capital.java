class Solution {
	public boolean detectCapitalUse(String word) {

		if (word.length() == 1) {
			return true;
		}

		boolean first = false;// 记录第1位是否是大写
		boolean second = false;// 记录第2位是否是大写

		for (int i = 0; i < word.length(); i++) {
			char temp = word.charAt(i);
			if (i == 0) {
				if ('A' <= temp && temp <= 'Z') {
					first = true;
				} else {
					first = false;
				}
			} else {
				if (first) {
					if (i == 1) {
						if ('A' <= temp && temp <= 'Z') {
							second = true;
						} else {
							second = false;
						}
					} else {
						if (second) {
							if ('a' <= temp && temp <= 'z') {
								return false;
							}
						} else {
							if ('A' <= temp && temp <= 'Z') {
								return false;
							}
						}
					}
				} else {// first = false;
					if ('A' <= temp && temp <= 'Z') {
						return false;
					}
				}
			}
		}

		return true;
	}
}