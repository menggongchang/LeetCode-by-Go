/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
	public int guessNumber(int n) {
		int left = 1;
		int right = n;
		while (left <= right) {
			int mid1 = left + (right - left) / 3;
			int mid2 = right - (right - left) / 3;
			int res1 = guess(mid1);
			int res2 = guess(mid2);
			if (res1 == 0) {
				return mid1;
			}
			if (res2 == 0) {
				return mid2;
			}
			if (res1 < 0) {
				right = mid1 - 1;
			} else if (res2 > 0) {
				left = mid2 + 1;
			} else {
				left = mid1 + 1;
				right = mid2 - 1;
			}
		}
		return -1;
	}
}