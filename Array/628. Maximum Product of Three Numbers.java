//class Solution {
//	public int maximumProduct(int[] nums) {
//		Integer max = null;
//		Integer mid = null;
//		Integer min = null;
//
//		for (int i : nums) {
//			if (max == null || i >= max) {
//				min = mid;
//				mid = max;
//				max = i;
//			} else if (mid == null || i >= mid) {
//				min = mid;
//				mid = i;
//			} else if (min == null || i >= min) {
//				min = i;
//			}
//		}
//
//		return max * mid * min;
//	}
//}
//没有考虑负数
//Input:
//[-4,-3,-2,-1,60]
//Output:
//120
//Expected:
//720
//class Solution {
//	public int maximumProduct(int[] nums) {
//
//		int a = nums[0];
//		int b = nums[1];
//		int c = nums[2];
//
//		int maxProduct = a * b * c;
//
//		int temp1, temp2, temp3;
//		for (int i = 3; i < nums.length; i++) {
//			temp1 = b * c * nums[i];//替换a
//			temp2 = a * c * nums[i];//替换b
//			temp3 = a * b * nums[i];//替换c
//			int temp = max3(temp1, temp2, temp3);
//			if (temp > maxProduct) {
//				maxProduct = temp;
//				if (temp == temp1) {
//					a = nums[i];
//					continue;
//				}
//				if (temp == temp2) {
//					b = nums[i];
//					continue;
//				}
//				if (temp == temp3) {
//					c = nums[i];
//					continue;
//				}
//			}
//		}
//		return maxProduct;
//	}
//
//	private int max3(int a, int b, int c) {
//		int max = Math.max(a, b);
//		if (max >= c) {
//			return max;
//		} else {
//			return c;
//		}
//	}
//}
//负数情况还是有问题
//Input:
//[-4,-3,-2,-1,60]
//Output:
//360
//Expected:
//720


//https://leetcode.com/problems/maximum-product-of-three-numbers/solution/
class Solution {
	public int maximumProduct(int[] nums) {
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;

		for (int x : nums) {
			if (x <= min1) {
				min2 = min1;
				min1 = x;
			} else if (x <= min2) {
				min2 = x;
			}
			if (x >= max1) {
				max3 = max2;
				max2 = max1;
				max1 = x;
			} else if (x >= max2) {
				max3 = max2;
				max2 = x;
			} else if (x >= max3) {
				max3 = x;
			}
		}
		return Math.max(max1 * max2 * max3, max1 * min1 * min2);
	}
}
