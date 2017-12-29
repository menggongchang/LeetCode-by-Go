import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
			nums[i] = -1;
		}

		for (int x : list) {
			nums[x - 1] = 1;
		}

		list.clear();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == -1) {
				list.add(i + 1);
			}
		}

		return list;
	}
}