class Solution {
    static int n;
    public static int solve(int i, int[]nums, int dp[]) {
        if(i>=n) {
            return 0;
        }
        if(dp[i]!=-1) {
            return dp[i];
        }
        int take=nums[i]+solve(i+2,nums,dp);
        int skip=0;
        skip=solve(i+1,nums,dp);
        return dp[i]=Math.max(take,skip);

    }
    public int rob(int[] nums) {
        n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,nums,dp);

    }
}