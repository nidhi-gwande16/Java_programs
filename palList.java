class Lists {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode previous=null;
        while(slow!=null)
        {
            ListNode temp=slow.next;
            slow.next=previous;
            previous=slow;
            slow=temp;
        }
        while(previous!=null)
        {
            if(head.val!=previous.val)
            return false;
            head=head.next;
            previous=previous.next;
        }
        return true;
    }
}
