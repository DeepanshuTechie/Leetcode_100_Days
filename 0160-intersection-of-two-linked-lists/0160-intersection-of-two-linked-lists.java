/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int lenb = 0;
        int lena = 0;
        while(a != null){
            a = a.next;
            lena++;
        }
        while(b != null){
            b = b.next;
            lenb++;
        }
        a = headA;
        b = headB;
        while(lena > lenb){
            a = a.next;
            lena--;
        }
        while(lenb > lena){
            b = b.next;
            lenb--;
        }
        while(a != b){
            a = a.next;
            b = b.next;
        }
        return a;
    }
}