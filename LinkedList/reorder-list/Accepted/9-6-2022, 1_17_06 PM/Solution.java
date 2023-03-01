// https://leetcode.com/problems/reorder-list

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
            if(head==null||head.next==null) return;
    
    ListNode l1 = head,slow=head,prev=null,fast=head;
    while(fast!=null&&fast.next!=null)
    {
        prev=slow;
        slow=slow.next;
        fast=fast.next.next;
    }
    prev.next=null;
    
    ListNode l2 = reverse(slow);
    
    merge(l1,l2);
    
}

public ListNode reverse(ListNode head)
{
    ListNode curr = head,prev=null,nex=null;
    while(curr!=null)
    {
        nex=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nex;
    }
    return prev;
}

public void merge(ListNode first, ListNode second)
{
    ListNode nex1=null,nex2=null;
    while(first.next!=null)
    {
        nex1=first.next;
        nex2=second.next;
        first.next=second;
        second.next=nex1;
        first=nex1;
        second=nex2;
    }
    first.next=second;
}
}