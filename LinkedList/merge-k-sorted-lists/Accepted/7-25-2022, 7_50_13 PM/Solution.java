// https://leetcode.com/problems/merge-k-sorted-lists

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
    public ListNode mergeKLists(ListNode[] lists) {
        
        ListNode head = new ListNode(0);
        ListNode cur = head;
        if (lists == null || lists.length < 1) {
        return null;
    }
        
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
            
            public int compare(ListNode l1, ListNode l2){
                 return l1.val - l2.val;
            }
        });
        
        for(int i = 0; i < lists.length;i++){
               if(lists[i] != null){
                   heap.offer(lists[i]);
               }
        }
        
        while(!heap.isEmpty()){
             ListNode temp = heap.poll();
             cur.next = temp;
             if(temp.next != null){
                 heap.offer(temp.next);
             }
            cur = temp;
                
        }
        
        return head.next;
        
        
    }
}