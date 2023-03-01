// https://leetcode.com/problems/subtree-of-another-tree

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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        else if(isSameTree(root,subRoot)){
            return true;
        }
        else{
            return isSubtree(root.left,subRoot.left) && isSubtree(root.right,subRoot.right) 
            
        }
        
        
    
        private boolean isSameTree(TreeNode s, TreeNode t){
            if(s== null || t == null){
                return false;
            }
            else if(s.val == t.val){
                return isSameTree(s.left,t.left) && isSameTree(s.right, t.right);
            }
            else{
                return false;
            }
            
        }
        
    }
}