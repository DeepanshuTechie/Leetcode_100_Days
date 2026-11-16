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
    public List<Double> averageOfLevels(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> a  = new ArrayList<>();
        if(root == null) return a;
        q.add(root);
        while(!q.isEmpty()){
            
            long sum = 0;
            int cnt = 0;
            int s = q.size();
            for(int i = 0;i<s;i++){
                TreeNode m = q.poll();
                sum+=m.val;
                cnt++;
                
                if(m.left != null) q.add(m.left);
                if(m.right != null) q.add(m.right);
            }
            a.add((double) sum/cnt);
        }
        return  a;
    }
}