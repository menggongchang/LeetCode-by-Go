class Solution {
	public int removeElement(int[] nums, int val) {
		int N = nums.length;
		if (N < 1) {
			return N;
		}
		int length = 0;
		for (int i = 0, j = N - 1; i <= j;) {
			while (j > -1 && nums[j] == val) {
				j--;
			}
			if (i > j) {
				break;
			}
			while (i < N && nums[i] != val) {
				i++;
				length++;
			}
			if (i > j) {
				break;
			}
			exch(nums, i, j);
		}
		return length;
	}

	private void exch(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}