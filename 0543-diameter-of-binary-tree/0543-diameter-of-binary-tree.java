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
    public int diameterOfBinaryTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int diameter = 0;
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            int lefts = height(curr.left);
            int rights = height(curr.right);
            diameter  = Math.max(diameter,lefts+rights);
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        return diameter;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int height = 0;
        while(!q.isEmpty()){
           int s = q.size();
           for(int i = 0;i<s;i++){
                TreeNode c = q.poll();
                if(c.left != null) q.add(c.left);
                if(c.right != null) q.add(c.right);
           }
           height++;
        }
        return height;
    }
}