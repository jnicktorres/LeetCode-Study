// https://leetcode.com/problems/middle-of-the-linked-list

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
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        int length = 1 ;
        ListNode copy = head;
        while(head != null){
            head = head.next;
            length++;
        }
        
        
        if(length % 2 != 0){
           length = (length/2) + 1; 
        }
        else{
            length = length/2;
        }
        int i = 1;
        while(i != length){
            
            copy = copy.next;
            i++;
        }
        System.out.println(length);
        return copy;
        
    }
}