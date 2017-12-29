import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = left; i <= right; i++) {
			if (i == 0) {
				continue;
			}
			if (i <= 9) {
				list.add(i);
				continue;
			}
			int number = i;
			boolean selfDivid = true;
			while (number != 0) {
				int temp = number % 10; //每一位
				if (temp == 0) {// a self-dividing number is not allowed to
								// contain the digit zero.
					selfDivid = false;
					break;
				}
				if (i % temp != 0) {
					selfDivid = false;
					break;
				} else {
					number = number / 10;
				}
			}
			if (selfDivid) {
				list.add(i);
			} else {
				continue;
			}
		}

		return list;
	}
}