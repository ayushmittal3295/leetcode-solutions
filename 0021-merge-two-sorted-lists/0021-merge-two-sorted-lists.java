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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer>arr1=new ArrayList<>();
        ListNode temp1=list1;
        while(temp1!=null) {
            arr1.add(temp1.val);
            temp1=temp1.next;
        }

        ArrayList<Integer>arr2=new ArrayList<>();
        ListNode temp2=list2;
        while(temp2!=null) {
            arr2.add(temp2.val);
            temp2=temp2.next;
        }

        ArrayList<Integer>res=new ArrayList<>();
        int i=0;
        int j=0;
        int n=arr1.size();
        int m=arr2.size();
        while(i<n && j<m) {
            if(arr1.get(i)<arr2.get(j)) {
                res.add(arr1.get(i));
                i++;
            } else {
                res.add(arr2.get(j));
                j++;
            }
        }

        while(i<n) {
            res.add(arr1.get(i));
            i++;
        }

        while(j<m) {
            res.add(arr2.get(j));
            j++;
        }

        ListNode h=null;
        ListNode t=null;
        for(int x:res) {
            ListNode newNode = new ListNode(x);

            if(h==null) {
                h=newNode;
                t=newNode;
            } else {
                t.next=newNode;
                t=newNode;
            }
        }
        return h;



        
    }
}