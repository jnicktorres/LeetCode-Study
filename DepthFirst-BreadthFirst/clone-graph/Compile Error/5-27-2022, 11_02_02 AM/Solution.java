// https://leetcode.com/problems/clone-graph

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        
        HashMap<Integer, Node> map = new HashMap();
        
        return dfs(node,map);
    }
    
    private Node(Node node, HashMap<Integer,Node> map){
        if(map.containsKey(node.val)){
            return map.get(node.val);
        }
        Node copy = new Node(node.val);
        
        map.put(node.val,copy);
        
        for(Node nei : node.neighbors){
            copy.neighbors.add(dfs(nei,map));
        }
        
        return copy;
        
    }
}