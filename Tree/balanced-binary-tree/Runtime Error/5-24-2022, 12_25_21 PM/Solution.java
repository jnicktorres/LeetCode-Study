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
        int countLeft = 0;
        int countRight = 0;
        
        int left = findDepth(root.left,countLeft);
        int right = findDepth(root.right,countRight);
        
        if(Math.abs(left-right) > 1){
            return false;
        }
        
            return true;
                
    }
    
    private int findDepth(TreeNode node,int count){
        if(node.left == null && node.right == null){
            count++;
            return count;
        }
        else if(node.left == null && node.right != null){
            count++;
            findDepth(node.right,count);
        }
        else if(node.left != null && node.right == null){
            count++;
            findDepth(node.left,count);
        }
        
            count++;
            return Math.max(findDepth(node.left,count),findDepth(node.right,count));
            
        
    }

}