class Solution {

	int[][] grid;
	int row;
	boolean seen[][];

	public int maxAreaOfIsland(int[][] grid) {

		this.grid = grid;
		this.row = grid.length;
		this.seen = new boolean[row][];
		for (int i = 0; i < row; i++) {
			this.seen[i] = new boolean[grid[i].length];
		}

		int area = 0;
		for (int i = 0; i < row; i++) {
			int column = grid[i].length;
			for (int j = 0; j < column; j++) {
				if (!seen[i][j] && grid[i][j] != 0) {
					int newArea = getMaxArea(i, j);
					area = newArea > area ? newArea : area;
				}
			}
		}

		return area;
	}

	private int getMaxArea(int i, int j) {
		if (i >= 0 && i < this.row) {
			int column = this.grid[i].length;
			if (j >= 0 && j < column) {
				if (this.grid[i][j] == 0 || this.seen[i][j]) {
					return 0;
				} else {
					this.seen[i][j] = true;
					return 1 + getMaxArea(i - 1, j) + getMaxArea(i, j - 1)
							+ getMaxArea(i, j + 1) + getMaxArea(i + 1, j);
				}
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}
}