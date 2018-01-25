
//time limit
class Solution {

    private HashMap<Integer, Integer> map;

    public int climbStairs(int n) {

        map = new HashMap<>();
        return climb(n);
    }

    private int climb(int n) {
        if (n == 1) {
            map.put(1, 1);
            return 1;
        }
        if (n == 2) {
            map.put(2, 2);
            return 2;
        }
        int left = map.getOrDefault(n - 1, 0);
        int right = map.getOrDefault(n - 2, 0);
        if (left == 0) {
            left = climbStairs(n - 1);
        }
        if (right == 0) {
            right = climbStairs(n - 2);
        }
        map.put(n, left + right);
        return left + right;
    }

}

class Solution {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

}