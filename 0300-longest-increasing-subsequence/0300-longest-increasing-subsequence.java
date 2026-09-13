class Solution {
    static int n;
    static int dp[][];
    public int solve(int i, int p, int nums[]) {
        if(i>=n) {
            return 0;
        }
        if(dp[i][p+1]!=-1) {
            return dp[i][p+1];
        }

        int skip=solve(i+1,p,nums);
        int take=0;
        if(p==-1||nums[p]<nums[i]) {
            take=1+solve(i+1,i,nums);
        }
        return dp[i][p+1]=Math.max(take,skip);
    }
    public int lengthOfLIS(int[] nums) {
        n=nums.length;
        dp=new int[n+1][n+1];
        for(int r[]:dp) {
            Arrays.fill(r,-1);
        }
        return solve(0,-1,nums);

        
    }
}