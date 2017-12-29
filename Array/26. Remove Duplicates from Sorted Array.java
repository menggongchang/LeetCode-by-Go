class Solution {
	public int removeDuplicates(int[] nums) {
		int N = nums.length;
		if (N <= 1) {
			return N;
		}

		int length = 1;// 至少一个
		// 1:统计递增数字个数
		for (int i = 1; i < N; i++) {
			if (nums[i] > nums[i - 1]) {
				length++;
			}
		}
		// 数组数字全部相同
		if (length == 1) {
			return length;
		}

		// 2:调节数组位置
		int temp = length-1;
		for (int i = 1; i < N; i++) {
			if (temp == 0) {
				break;
			}
			if (nums[i] > nums[i - 1]) {
				temp--;
			} else if (nums[i] == nums[i - 1]) {
				for (int j = i; j < N - 1; j++) {
					if (nums[j] <= nums[j + 1]) {
						exch(nums, j, j + 1);
					}
				}
				i--;
			}
		}
		return length;
	}

	private void exch(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}