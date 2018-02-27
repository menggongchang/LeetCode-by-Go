/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
	public int firstBadVersion(int n) {

		if (isBadVersion(1)) {
			return 1;
		}

		int left = 1;
		int right = n;

		while (left <= right) {
			int mid1 = left + (right - left) / 2;
			int mid2 = right - (right - left) / 2;
			boolean midBad1 = isBadVersion(mid1);
			boolean midBad2 = isBadVersion(mid2);
			if (midBad1) {
				if (isBadVersion(mid1 - 1)) {
					right = mid1 - 1;
				} else {
					return mid1;
				}
				continue;
			}
			if (!midBad2) {
				if (isBadVersion(mid2 + 1)) {
					return mid2 + 1;
				} else {
					left = mid2 + 1;
				}
				continue;
			}
			if (mid1 + 1 == mid2) {
				return mid2;
			} else {
				left = mid1;
				right = mid2;
			}
		}
		return -1;
	}
}