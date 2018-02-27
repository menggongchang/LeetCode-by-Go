class Solution {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        int W = binarySearch(area);
        if (area % W == 0) {
            result[0] = area / W;
            result[1] = W;
            return result;
        } else {
            for (int i = W - 1; i >= 1; i--) {
                if (area % i == 0) {
                    result[0] = area / i;
                    result[1] = i;
                    break;
                }
            }
            return result;
        }
    }

    private int binarySearch(int area) {
        long low = 1;
        long high = area;
        long mid;
        while (low <= high) {
            mid = (low + high) / 2;
            long sum = mid * mid;
            if (sum == area) {
                return (int) mid;
            } else if (sum < area) {
                if ((mid + 1) * (mid + 1) > area) {
                    return (int) mid;
                }
                low = mid + 1;
            } else {
                if ((mid - 1) * (mid - 1) < area) {
                    return (int) mid - 1;
                }
                high = mid - 1;
            }
        }
        return -1;
    }

}