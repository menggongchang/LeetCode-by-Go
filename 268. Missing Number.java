class Solution {
    public int missingNumber(int[] nums) {
        
    	int N= nums.length;
    	int sum = 0;
    	for(int x:nums){
    		sum+=x;
    	}
    	return (N+1)*N/2-sum;
    }
}