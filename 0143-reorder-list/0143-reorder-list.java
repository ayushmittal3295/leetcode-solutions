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
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode l=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return l;
    }
    public void reorderList(ListNode head) {
        // middle nikal lenge linked list ka
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null) {
            s=s.next;
            f=f.next.next;
        }
        //tune second half linkedlist ka rev kar diya 
        ListNode sec=reverseList(s);
        ListNode fi=head;

        // ab dono list ko merge kaer denge
        while(sec!=null && sec.next!=null) {
            ListNode temp1=fi.next;
            ListNode temp2=sec.next;

            fi.next=sec;
            sec.next=temp1;

            fi=temp1;
            sec=temp2;


        }


        

    }
}