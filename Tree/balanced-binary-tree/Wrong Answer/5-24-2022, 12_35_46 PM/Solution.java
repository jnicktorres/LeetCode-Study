// https://leetcode.com/problems/balanced-binary-tree

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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        
        int left = findDepth(root.left);
        int right = findDepth(root.right);
        
        if(Math.abs(left-right) > 1){
            return false;
        }
        
            return true;
                
    }
    
    private int findDepth(TreeNode node){
        if(node == null){
            return 0;
        }
        return Math.max(findDepth(node.left),findDepth(node.right)) + 1;
    }

}