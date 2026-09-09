/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode a = head;
        ArrayList<Integer> list = new ArrayList<>();

        while(a != null){
            list.add(a.val);
            a = a.next;
        }
        int max = 0;
        int i = 0;
        int j = list.size() - 1;
        while(i < j){
            max = Math.max(max,list.get(i) + list.get(j));
            i++;j--;
        }
        return max;
    }
}