// https://leetcode.com/problems/cousins-in-binary-tree

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
    TreeNode xParent = null;
    TreeNode yParent = null;
    int xDepth = -1, yDepth = -1;
    public boolean isCousins(TreeNode root, int x, int y) {
        getDepth(root, x, y, 0, null);
        return xDepth == yDepth && xParent != yParent? true: false;

    }
    
    private void getDepth(TreeNode node, int s, int y, int depth, TreeNode parent) {
        if(node == null){
            return false;
        }
        
        if(node.val == s){
            xParent = parent;
            xDepth = depth;
        }
        else if(node.val == y){
            yParent = parent;
            yDepth = depth;
        }
        
        getDepth(node.left, s, t, depth + 1, node);
        getDepth(node.right, s, t, depth + 1, node);
        
    }
}