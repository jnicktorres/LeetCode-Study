// https://leetcode.com/problems/maximum-depth-of-binary-tree

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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        return Math.max(left,right) + 1;
    }
    
    private int dfs(TreeNode node){
        
        if(node == null){
            return 0;
        }
        else{
            return Math.max(dfs(node.left) + 1, dfs(node.right) +1);
            
            
        }
        
    }
}