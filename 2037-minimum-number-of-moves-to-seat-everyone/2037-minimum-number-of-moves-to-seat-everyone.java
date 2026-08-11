class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int n =seats.length;
        int max=0;
        for(int x:seats) {
            max=Math.max(max,x);
        }

        for(int x:students) {
            max=Math.max(max,x);
        }
        
        int pos_seat[]=new int[max+1];
        int pos_stu[]=new int[max+1];


        for(int pos:seats) {
            pos_seat[pos]++;
        }

        for(int pos:students) {
            pos_stu[pos]++;
        }

        int i=0;
        int j=0;
        int moves=0;
        while(i<=max && j<=max) {
            if(pos_seat[i]==0) i++;
            if(pos_stu[j]==0) j++;

            if(i<=max && j<=max && pos_seat[i]!=0 && pos_stu[j]!=0) {
                moves+=Math.abs(j-i);
                pos_seat[i]--;
                pos_stu[j]--;
            }
        }
        return moves;
    }
}