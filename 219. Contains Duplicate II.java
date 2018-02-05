import java.util.HashMap;

//暴力：Time Limit Exceeded
//class Solution {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//       
//    	boolean containsNearbyDuplicate = false;
//    	label:
//    	for(int i=0;i<nums.length;i++){
//        	for(int j=i+1;j<nums.length&& (j-i)<=k;j++){
//        		if(nums[i]==nums[j]){
//        			containsNearbyDuplicate = true;
//        			break label;
//        		}
//        	}
//        }
//    	return containsNearbyDuplicate;
//    }
//}

class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {

		boolean containsNearbyDuplicate = false;
		HashMap<Integer, Integer> left = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> right = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (!left.containsKey(nums[i])) {
				left.put(nums[i], i);
				right.put(nums[i], i);
				continue;
			}
			int oldLft = left.get(nums[i]);
			int oldRight = right.get(nums[i]);
			if (oldLft == oldRight) {
				if (i - oldRight <= k) {
					containsNearbyDuplicate = true;
					break;
				} else {
					right.put(nums[i], i);
					continue;
				}
			}
			if (oldLft < oldRight) {
				if (i - oldRight <= k) {
					containsNearbyDuplicate = true;
					break;
				} else {
					left.put(nums[i], oldRight);
					right.put(nums[i], i);
					continue;
				}
			}
		}
		return containsNearbyDuplicate;
	}
}