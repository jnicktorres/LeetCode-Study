// https://leetcode.com/problems/lru-cache

class LRUCache {
    
    HashMap<Integer, Node> map = new HashMap();
    final Node head = new Node();
    final Node tail = new Node();
    int cap;
    
    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap(capacity);
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
            newNode.val = value;
            newNode.key = key;
            map.put(key, newNode);
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
        Node prevNode = node.prev;
        Node nextNode = node.next;
        nextNode.prev = prevNode;
        prevNode.next = nextNode;
        
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