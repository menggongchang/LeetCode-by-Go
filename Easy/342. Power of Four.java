class Solution {
	public boolean isPowerOfFour(int num) {
		int x = (int) (Math.log10(num) / Math.log10(4));
		return num > 0 && (int) Math.pow(4, x) == num;
	}
}