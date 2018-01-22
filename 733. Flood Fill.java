//  Time Limit Exceeded
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        LinkedList<Integer> stackR = new LinkedList<>();
        LinkedList<Integer> stackC = new LinkedList<>();
        stackR.push(sr);
        stackC.push(sc);

        int r;
        int c;
        int oldColor = image[sr][sc];
        while (!stackR.isEmpty()) {
            r = stackR.pop();
            c = stackC.pop();
            image[r][c] = newColor;
            if (c - 1 >= 0 && image[r][c - 1] == oldColor) {
                stackR.push(r);
                stackC.push(c - 1);
            }
            if (c + 1 < image[r].length && image[r][c + 1] == oldColor) {
                stackR.push(r);
                stackC.push(c + 1);
            }
            if (r - 1 >= 0 && image[r - 1][c] == oldColor) {
                stackR.push(r - 1);
                stackC.push(c);
            }
            if (r + 1 < image.length && image[r + 1][c] == oldColor) {
                stackR.push(r + 1);
                stackC.push(c);
            }
        }
        return image;
    }
}

class Solution {
    private int oldColor;
    private int newColor;
    private int[][] image;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        this.oldColor = image[sr][sc];
        this.newColor = newColor;
        this.image = image;

        if (image[sr][sc] != newColor) {
            this.image[sr][sc] = newColor;
            change(sr, sc);
        }
        return this.image;
    }

    private void change(int r, int c) {
        if (c - 1 >= 0 && image[r][c - 1] == oldColor) {
            image[r][c - 1] = newColor;
            change(r, c - 1);
        }
        if (c + 1 < image[r].length && image[r][c + 1] == oldColor) {
            image[r][c + 1] = newColor;
            change(r, c + 1);
        }
        if (r - 1 >= 0 && image[r - 1][c] == oldColor) {
            image[r - 1][c] = newColor;
            change(r - 1, c);
        }
        if (r + 1 < image.length && image[r + 1][c] == oldColor) {
            image[r + 1][c] = newColor;
            change(r + 1, c);
        }
    }
}