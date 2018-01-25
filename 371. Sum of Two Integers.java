
//https://www.cnblogs.com/dyzhao-blog/p/5662891.html
class Solution {
    public int getSum(int a, int b) {
        int c;
        while (b != 0) {
            c = a ^ b;//相加
            b = (a & b) << 1;//进位
            a = c;
        }
        return a;
    }
}