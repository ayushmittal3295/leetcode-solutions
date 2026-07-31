class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        int i=0;
        int j=1;
        int n = intervals.length;
        if(n==0) return 0;
        Arrays.sort(intervals,(a,b) ->Integer.compare(a[0],b[0]));

        while(j<n) {
            int[]currIn=intervals[i];
            int[]nextIn=intervals[j];

            int cs=currIn[0];
            int ce=currIn[1];

            int ns=nextIn[0];
            int ne=nextIn[1];

            if(ce<=ns) {
                i=j;
                j++;
            } else if(ce<=ne) {
                j++;
                count++;
            } else {
                i=j;
                j++;
                count++;
            }
        }
        return count;


    }
}