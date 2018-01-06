
class Solution {
	public boolean checkPerfectNumber(int num) {

		if (num == 0 || num == 1)
			return false;
		int sum = 0;
		for (int i = 1; i * i <= num; i++) {
			if (i == 1) {
				sum += 1;
				continue;
			}
			if (num % i == 0) {
				sum += i;
				sum += num / i;
			}
			if (sum > num) {
				return false;
			}
		}
		return sum == num;
	}
}