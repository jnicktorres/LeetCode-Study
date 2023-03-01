// https://leetcode.com/problems/lru-cache

class LRUCache {
    
    HashMap<Integer,Node> map;
   final  Node head = new Node();
   final Node tail = new Node();
    int cap;
    
     public LRUCache(int capacity) {
     map = new HashMap(capacity);
     this.cap = capacity;
     head.next = tail;
     tail.prev = head;
    }
    
    public int get(int key) {
        int res = -1;
        Node node = map.get(key);
        if(node != null){
            res = node.val;
            remove(node);
            add(node);
        }
        
        return res;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        if(node != null){
            remove(node);
            node.val = value;
            add(node);
        }
        else{
            if(map.size() == cap){
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;
            add(newNode);
            map.put(key,newNode);
        }
        
    }
    
    public void add(Node node){
        Node headnext = head.next;
        node.next = headnext;  
        headnext.prev = node;
        head.next = node;
        node.prev = head;
        
                    
    }
    
    public void remove(Node node){
     Node headnext = node.next;
     Node prevNode = node.prev;
        
     headnext.prev = prevNode;
     prevNode.next = headnext;  
    
    }
 
    
}


public class Node{
     Node next;
     Node prev;
     int val;
     int key;
 }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */