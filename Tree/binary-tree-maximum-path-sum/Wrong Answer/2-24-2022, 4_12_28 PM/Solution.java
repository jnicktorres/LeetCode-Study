// https://leetcode.com/problems/binary-tree-maximum-path-sum

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
    int max;
    public int maxPathSum(TreeNode root) {
       
        pathSum(root);
        return max;
    }
    
    
    private int pathSum(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = Math.max(0,pathSum(node.left));
        int right = Math.max(0,pathSum(node.right));
        max = Math.max(max,left + right + node.val);
                             
        return Math.max(left,right) + node.val;
        
        
    }
}