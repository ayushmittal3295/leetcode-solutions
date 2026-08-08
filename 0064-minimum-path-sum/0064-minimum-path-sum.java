class Solution {
    static int dp[][];
    static int sum;
    static int n;
    static int m;
    public int fxn(int grid[][], int i, int j) {
        if(i>=n||j>=m) return Integer.MAX_VALUE;
        if(i==n-1&& j==m-1) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int down=fxn(grid,i+1,j);
        int right=fxn(grid,i,j+1);
        // main logic here
        return dp[i][j]=grid[i][j]+Math.min(down,right);


    }
    public int minPathSum(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        dp=new int[n+1][m+1];
        for(int i=0;i<n;i++) {
            Arrays.fill(dp[i],-1);
        }
        return fxn(grid,0,0);
        
        
    }
}