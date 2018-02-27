class Solution {
	public int largestPalindrome(int n) {
		if (n == 1) {
			return 9;
		}

		int high = (int) Math.pow(10, n) - 1;
		int low = (int) Math.pow(10, n - 1);
		for (int i = high; i >= low; i--) {
			long Palindrome = isPalindrome(i);
			for (int j = high; j >= low; j--) {
				if (Palindrome / j > high) {
					break;
				}
				if (Palindrome % j == 0) {
					return (int) (Palindrome % 1337);
				}
			}
		}
		return -1;
	}

	private long isPalindrome(int n) {
		StringBuilder sb = new StringBuilder();
		sb.append(n).reverse();
		return Long.parseLong(n + sb.toString());
	}

}