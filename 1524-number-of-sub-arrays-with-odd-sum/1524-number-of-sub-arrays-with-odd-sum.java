class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD=1000000007;
        int n=arr.length;
        long count=0;
        long sum=0;
        int even=1;
        int odd=0;
        for(int i=0;i<n;i++) {
           sum+=arr[i];
           if(sum%2==0) {
            count=count+odd;
            even++;
           } else {
            count+=even;
            odd++;
           }
           count=count%MOD;
        }
        return (int)count;
    }
}