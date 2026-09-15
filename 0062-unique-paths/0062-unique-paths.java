class Solution {
    static int dp[][];
    public int solve(int i, int j, int m, int n) {
        if(i==m-1||j==n-1) {
            return 1;
        }

        if(i<0||i>=m||j<0||j>=n) {
            return 0;
        }

        if(dp[i][j]!=-1) {
            return dp[i][j];
        }

        int down=solve(i+1,j,m,n);
        int right=solve(i,j+1,m,n);
        int ways=down+right;
        return dp[i][j]=ways;
    }
    
    public int uniquePaths(int m, int n) {
        dp=new int[m+1][n+1];
        for(int i=0;i<m;i++) {
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,m,n);

    }
}