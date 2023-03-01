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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        if(preorder.length == 1){
            return root;
        }
        int index = 0;
        for(int i =0; i < inorder.length;i++){
            if(inorder[i] == preorder[0]){
                index = i;
            }
        }
        
        int[] preleftsub = Arrays.copyOfRange(preorder, 1, index+1);
        int[] inleftsub =  Arrays.copyOfRange(inorder, 0, index);
        int[] prerightsub = Arrays.copyOfRange(preorder, index + 1, preorder.length);
        int[] inrightsub = Arrays.copyOfRange(inorder, index+1, inorder.length);
        root.left = buildTree(preleftsub,inleftsub);
        root.right = buildTree(prerightsub,inrightsub);
        return root;
        
    }
}