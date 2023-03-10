// https://leetcode.com/problems/min-stack

class MinStack {
    private Node head;
    
    public void push(int val) {
        if(head == null){
            head = new Node(val,val,null);
        }
            head = new Node(val, Math.min(val,head.min),head);
            
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
        
    }


private class Node{
    int min;
    int val;
    Node next;
    private Node(int val, int min, Node next){
        this.min  = min;
        this.val = val;
        this.next = next;
        }
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */