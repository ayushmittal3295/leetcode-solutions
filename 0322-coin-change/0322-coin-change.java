class Solution {
    static int n;
    static int dp[];
    public int solve(int amount, int coins[], int dp[]) {
        if(amount==0) {
            return 0; // no coins found
        }

        if(amount<0) {
            return Integer.MAX_VALUE;
        }

        if(dp[amount]!=-1) {
            return dp[amount];
        }

        int ans=Integer.MAX_VALUE;
        for(int coin:coins) {
            int res=solve(amount-coin, coins,dp);
            if(res!=Integer.MAX_VALUE) {
                ans=Math.min(ans,res+1);
            }
        }
        return dp[amount]=ans;



    }
    public int coinChange(int[] coins, int amount) {
        n=coins.length;
        dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int ans=solve(amount,coins,dp);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}