class Solution {
	public boolean isOneBitCharacter(int[] bits) {
		boolean isOneBitCharacter = false;
		for (int i = 0; i < bits.length; i++) {
			switch (bits[i]) {
			case 1:
				i++;
				break;
			case 0:
				if (i == bits.length - 1) {
					isOneBitCharacter = true;
				}
				break;
			}
		}
		return isOneBitCharacter;
	}
}