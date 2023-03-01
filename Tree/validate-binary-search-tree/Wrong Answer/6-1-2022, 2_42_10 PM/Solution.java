// https://leetcode.com/problems/validate-binary-search-tree

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
    
    public boolean isValidBST(TreeNode root) {
          
       return dfs(root);
         
    }
    
    private boolean dfs(TreeNode node){
        if(node == null){
            return false;
        }
        if((node.left != null && node.left.val > node.val) || (node.right != null && node.right.val < node.val )){
            return false;
        }
        dfs(node.left);
        dfs(node.right);
        
        return true;
    }
}