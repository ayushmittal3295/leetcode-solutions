class Solution {
    static int n;
    public int solve(int nums[], int s, int e) {
        int p2=0;
        int p1=0;
        for(int i=s;i<=e;i++) {
            int t=nums[i]+p2;
            int skip=p1;
            int curr=Math.max(t,skip);
            p2=p1;
            p1=curr;
        }
        return p1;
    }
    public int rob(int[] nums) {
        n=nums.length;
        if(n==1) {
            return nums[0];
        }
        int c1=solve(nums,0,n-2);
        int c2=solve(nums,1,n-1);
        return Math.max(c1,c2);
        
        
    }
    
}