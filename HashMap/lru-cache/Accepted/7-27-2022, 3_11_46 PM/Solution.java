// https://leetcode.com/problems/lru-cache

class LRUCache {
    HashMap<Integer,Node> map = new HashMap();
    final Node head = new Node();
    final Node tail = new Node();
    int cap;
    
    
    public LRUCache(int capacity) {
        map = new HashMap(capacity);
        this.cap = capacity;    
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        int ret = -1;
        if(node != null){
            ret = node.val;
            remove(node);
            add(node);
        }
        return ret;
        
        
        
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
            map.put(key,newNode);
            add(newNode);
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
        Node nextnode = node.next;
        Node prevnode = node.prev;
        
        nextnode.prev = prevnode;
        prevnode.next = nextnode;
    }
    
}

public class Node{
        int key;
        int val;
        Node next;
        Node prev;
        
        
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */