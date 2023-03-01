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
        max = Integer.MIN_VALUE;
        maxPath(root);
        
        return max;      
    }
    
    private int maxPath(TreeNode n){
        if(n == null){
            return 0;
        }
        int left = Math.max(0, maxPath(n.left));
        int right = Math.max(0, maxPath(n.right));
        
        max = Math.max(max, n.val + left + right);
        
        return Math.max(left,right) + n.val;
    
    }
}




       

    
    