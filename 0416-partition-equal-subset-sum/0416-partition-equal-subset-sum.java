class Solution {
    static int n;
    static Boolean dp[][];
    public static boolean solve(int nums[], int sum, int i) {
        if(i>=n) {
            return false;
        }
        if(sum==0) {
            return true;
        }
        if(dp[sum][i]!=null) {
            return dp[sum][i];
        }
        Boolean t=false;
        Boolean nt=false;
       
        if(sum>=nums[i]) {
            t=solve(nums,sum-nums[i],i+1);
            
        }
        nt=solve(nums,sum,i+1);
        return dp[sum][i]=t||nt;

    }
    public boolean canPartition(int[] nums) {
        n = nums.length;
        int sum=0;
      
        for(int x:nums) {
            sum+=x;
        }
        if(sum%2!=0) {
            return false;
        }
        int t=sum/2;
        dp=new Boolean[t+1][n];
        return solve(nums,t,0);

    }
}