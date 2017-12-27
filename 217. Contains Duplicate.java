import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0){
        	return false;
        }
        
        Arrays.sort(nums);
        boolean containsDuplicate = false;
        for(int i=0;i<nums.length-1;i++){
        	if(nums[i] == nums[i+1]){
        		containsDuplicate = true;
        		break;
        	}
        }
        return containsDuplicate;
    }
}