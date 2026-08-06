class Solution {
    static int n;
    static int m;
    int[][]directions={{1,0},{-1,0},{0,1},{0,-1}};
    public boolean exist(char[][] board, String word) {
        n=board.length;
        m=board[0].length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                if(find(board,i,j,0,word)) {
                    return true;
                }
            }
        }
        return false;

    }

    public boolean find(char[][] board,int i, int j, int idx, String word) {
        if(idx==word.length()) return true;
        if(i<0||j<0||i>=n||j>=m||board[i][j]=='$') {
            return false;
        }

        if (board[i][j]!=word.charAt(idx)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '$';   
        for (int[] dir:directions) {
            int newI=i+dir[0];
            int newJ=j+dir[1];

            if (find(board,newI,newJ,idx+1,word)) {
                board[i][j]=temp; 
                return true;
            }
        }

        board[i][j]=temp; 
        return false;
    }
}