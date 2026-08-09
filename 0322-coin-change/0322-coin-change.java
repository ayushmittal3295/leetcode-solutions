class Solution {
    static int dp[][];
    static int n;

    public int solve(int[]coins, int amount, int i) {
        if(amount==0) {
            return 0;
        }
        if(i>=n){
            return 100000;
        }

        if(dp[amount][i]!=-1) {
            return dp[amount][i];
        }

        int t=100000;
        int nt;
        if(amount>=coins[i]) {
            t=1+solve(coins,amount-coins[i],i);
        }
        nt=solve(coins,amount,i+1);
        return dp[amount][i]=Math.min(t,nt);
    }
    public int coinChange(int[] coins, int amount) {
        n = coins.length;
        dp=new int[amount+1][n+1];
        for(int i=0;i<=amount;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=solve(coins,amount,0);
        if(ans>=100000) {
            return -1;
        }
        return ans;
    }
}