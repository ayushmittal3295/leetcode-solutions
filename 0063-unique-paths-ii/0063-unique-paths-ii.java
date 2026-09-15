class Solution {
    static int n;
    static int m;
    static int dp[][];
    public int solve(int[][]obstacleGrid, int i, int j) {
        if(i<0||i>=m||j<0||j>=n) {
            return 0;
        }

        if(obstacleGrid[i][j]==1) {
            return 0;
        }
        if(i==m-1 && j==n-1) {
            return 1;
        }

        if(dp[i][j]!=-1) {
            return dp[i][j];
        }
        int d=solve(obstacleGrid,i+1,j);
        int r=solve(obstacleGrid,i,j+1);
        return dp[i][j]=d+r;



    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        m=obstacleGrid.length;
        n=obstacleGrid[0].length;
        dp=new int[m+1][n+1];
        for(int i=0;i<m;i++) {
            Arrays.fill(dp[i],-1);
        }
        // for(int i=0;i<m;i++) {
        //     for(int j=0;j<n;j++) {
        //         if(obstacleGrid[i][j]=='1') {
        //             break;
        //         }
        //     }
        // }
        return solve(obstacleGrid,0,0);


        
    }
}