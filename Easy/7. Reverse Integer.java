class Solution {
    public int reverse(int x) {
    	
    	if(x==0) return 0;
    	
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.reverse();
        try{
        	if(x>0){
        		return Integer.parseInt(sb.toString());
        	}else{
        		sb.deleteCharAt(sb.length()-1);
        		return -Integer.parseInt(sb.toString());
        	}
        }catch(Exception e){
        	return 0;
        }
    }
}