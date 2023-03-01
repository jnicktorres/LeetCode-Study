// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap();
        
        for(int i = 0; i < inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        return helper(map,preorder,0,inorder.length-1);
        
        
        
    }
    
    private TreeNode helper(HashMap<Integer,Integer> map, int[] preorder, int start, int end){
        if(start>end){
            return null;
        }
        int var = preorder[index++];
        TreeNode root = new TreeNode(var);
        int cur = map.get(var);
        root.left = helper(map,preorder,start, cur - 1);
        root.right = helper(map,preorder,cur+1, end);
        
        return root;
    }
}