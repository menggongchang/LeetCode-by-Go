//class Solution {
//	public int thirdMax(int[] nums) {
//
//		int N = nums.length;
//
//		int first = Integer.MIN_VALUE;
//		int second = Integer.MIN_VALUE;
//		int third = Integer.MIN_VALUE;
//
//		for (int i = 0; i < N; i++) {
//			if (nums[i] > first) {
//				second = first;
//				first = nums[i];
//				continue;
//			}
//			if (nums[i] < first && nums[i] > second) {
//				third = second;
//				second = nums[i];
//				continue;
//			}
//			if (nums[i] < second && nums[i] > third) {
//				third = nums[i];
//				continue;
//			}
//		}
//
//		if (third == Integer.MIN_VALUE) {
//			return first;
//		} else {
//			return third;
//		}
//	}
//}
//Input:
//[1,2,-2147483648]
//Output:
//2
//Expected:
//-2147483648

class Solution {
	public int thirdMax(int[] nums) {

		int N = nums.length;

		Long first = (long) (Integer.MIN_VALUE) - 1;
		Long second = (long) (Integer.MIN_VALUE) - 1;
		Long third = (long) (Integer.MIN_VALUE) - 1;

		for (int i = 0; i < N; i++) {
			if (nums[i] > first) {
				third = second;
				second = first;
				first = (long) nums[i];
				continue;
			}
			if (nums[i] < first && nums[i] > second) {
				third = second;
				second = (long) nums[i];
				continue;
			}
			if (nums[i] < second && nums[i] > third) {
				third = (long) nums[i];
				continue;
			}
		}

		if (third < Integer.MIN_VALUE) {
			return first.intValue();
		} else {
			return third.intValue();
		}
	}
}