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
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        
        
        while(!q.isEmpty()){
            int size = q.size();
            
            while(size > 0){
                TreeNode cur = q.poll();
                if(size == 1){
                    ls.add(cur.val);
                }
                 if(cur.left != null){
                    q.offer(cur.left);
                }
                 if(cur.right != null){
                    q.offer(cur.right);
                }
                size--;
            }
            
            
        }
        return ls;
    }
}