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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer>l1=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null) {
            l1.add(temp.val);
            temp=temp.next;
        }

        int m=l1.size();
        l1.remove(m-n);
        ListNode h=null;
        ListNode t=null;
        for(int x:l1) {
            ListNode node = new ListNode(x);
            if(h==null) {
                h=node;
                t=node;
            } else {
                t.next=node;
                t=node;
            }
        }
        return h;
        
    }
}