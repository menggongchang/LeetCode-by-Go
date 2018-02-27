/**
*  O(k) extra space,一维数组实时更新
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Integer> getRow(int rowIndex) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (rowIndex < 0)
			return list;

		int tempA, tempB;
		for (int i = 0; i <= rowIndex; i++) {
			list.add(i, 1);
			for (int j = i-1; j > 0; j--) {
				tempA = list.get(j - 1);
				tempB = list.get(j);
				list.set(j, tempA + tempB);
			}
			list.set(0, 1);
			list.set(i, 1);
		}
		return list;
	}
}