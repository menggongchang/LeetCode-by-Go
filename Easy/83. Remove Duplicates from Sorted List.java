class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next==null){
        	return head;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2 !=null){
        	if(p2.val>p1.val){
        		p1 = p2;
        		p2 = p2.next;
        	}else{
        		p2 = p2.next;
        		p1.next = p2;
        	}
        }
        return head;
    }
}