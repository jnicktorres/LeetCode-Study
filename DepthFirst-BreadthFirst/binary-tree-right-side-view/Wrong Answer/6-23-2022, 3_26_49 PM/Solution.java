// https://leetcode.com/problems/binary-tree-right-side-view

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ls = new ArrayList();
        if(root == null){
            return ls;
        }
        ls.add(root.val);
        TreeNode head = root.right;
        TreeNode prev = root;
        while(head != null) {
            if(head.val > prev.val){
            ls.add(head.val);
            prev = head;
            head = head.right;      
            }
            else{
                break;
            }
        }
        
        return ls;
    }
}