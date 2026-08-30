class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }

        ListNode slow=head;
        ListNode fast = head;

        while(fast.next != null&& fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        ListNode right = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        right = sortList(right);

        return merge (left,right);
        
    }
    public ListNode merge (ListNode left , ListNode right ){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(left!= null && right != null){
            if(left.val< right.val){
                temp.next=left;
                left = left.next;

            }
            else{
                temp.next = right;
                right = right.next;
            }
            temp= temp.next;



        }
        if (left!=null){
            temp.next=left;

        }
        if (right != null) {
            temp.next = right;
        }

        return dummy.next; 
    } 
}