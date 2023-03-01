// https://leetcode.com/problems/serialize-and-deserialize-bst

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        if(root == null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        
        dfs(root, sb);
        return sb.toString().trim();
    }
    
    public void dfs(TreeNode root, StringBuilder sb){
        if(root == null){
            return;
        }
        sb.append(root.val + " ");
        dfs(root.left,sb);
        dfs(root.right,sb);
        
    }
    

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] s =data.split(" ");
        
        
        return constructBST(s,0,s.length-1);
    }
                  
    public TreeNode constructBST(String[] arr, int start, int end){
        if(start>end) return null;
        TreeNode root = new TreeNode(Integer.parseInt(arr[start]));
        int index;
        for(index=start;index<=end;index++){
        if(Integer.parseInt(arr[index])>Integer.parseInt(arr[start])){
            break;
        }
        }
        root.left = constructBST(arr, start + 1, index - 1);
        root.right = constructBST(arr, index, end);
            
            return root;
    
    }         
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;