class String {
    public ListNode reverseList(ListNode head) {
        ListNode current= head , previous=null,temp;

        while(current!= null)
        {
            temp=current.next;
            current.next=previous;
            previous=current;
            current=temp;

        }
        return previous;
    }
}
