class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int sum=0;
        int sum1=0;
        int i=0,j=0;
        while(i<n && j<m) {
            sum+=mat[i][j];
            i++;
            j++;
        }
        int a=0;
        int b=m-1;
        while(a<n && b>=0) {
            sum1+=mat[a][b];
            a++;
            b--;
        }
        if(n%2!=0) {
            return sum+sum1-mat[n/2][m/2];
        }
        return sum+sum1;
    }
}