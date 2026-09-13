class Solution {
    static int n;
    static int dp[][];
    // ArrayList<Integer>list;
    public int solve(int amount, int coins[], int dp[][], int i) {
        if(amount==0) {
            return 1;
        }

        if(i==n||amount<0) return 0;

        if(dp[i][amount]!=-1) {
            return dp[i][amount];
        }

        int take=solve(amount-coins[i],coins,dp,i);
        int skip=solve(amount,coins,dp,i+1);
        return dp[i][amount]=take+skip;




    }
    public int change(int amount, int[] coins) {
        n=coins.length;
        dp=new int[n][amount+1];
        // list=new ArrayList<>();
        for(int r[]:dp) {
            Arrays.fill(r,-1);
        }
        return solve(amount,coins,dp,0);
        
    }
}