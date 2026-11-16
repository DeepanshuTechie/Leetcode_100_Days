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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int s = q.size();
            LinkedList<Integer> list = new LinkedList<>();
            for(int i = 0;i<s;i++){
               
               TreeNode curr = q.poll();
               if(flag){
                    list.addLast(curr.val);
               }
               else{
                list.addFirst(curr.val);
               }
               if(curr.left != null) q.offer(curr.left);
               if(curr.right != null) q.offer(curr.right);
            }
            ans.add(list);
            flag = !flag;
        }
        return ans;
    }
}