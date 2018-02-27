class Solution {
	public boolean judgeCircle(String moves) {
		int left = 0;
		int right = 0;
		int up = 0;
		int down = 0;
		for (int i = 0; i < moves.length(); i++) {
			switch (moves.charAt(i)) {
			case 'L':
				left++;
				break;
			case 'R':
				right++;
				break;
			case 'U':
				up++;
				break;
			case 'D':
				down++;
				break;
			default:
				break;
			}
		}
		if (left == right && up == down) {
			return true;
		} else {
			return false;
		}
	}
}