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
        if(root == null){
            return true;
        }
        
        return valid(root,null,null);
    }
    
    private boolean valid(TreeNode node, Integer min, Integer max){
        if(node == null){
            return true;
        }
        else if((min != null && node.val <= min) || (max != null && node.val >= max)){
            return false;
        }
        
        return valid(node.left,min,node.val) && valid(node.right,node.val,max);        
        
    }
}