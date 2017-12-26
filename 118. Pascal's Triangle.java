import java.util.ArrayList;
import java.util.List;
class Solution {
	public List<List<Integer>> generate(int numRows) {
		int[][] nums = new int[numRows][];
		for (int i = 0; i < numRows; i++) {
			nums[i] = new int[i + 1];
			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i) {
					nums[i][j] = 1;
				} else {
					nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
				}
			}
		}

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < i + 1; j++) {
				list.add(nums[i][j]);
			}
			result.add(list);
		}
		return result;
	}
}