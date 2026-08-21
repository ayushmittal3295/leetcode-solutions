class Solution {
    List<List<String>>result=new ArrayList<>();
    int N;

    boolean isValid(ArrayList<String>board, int row, int col) {
        for(int i=row-1;i>=0;i--) {
            if(board.get(i).charAt(col) == 'Q') {
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
            if(board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }


        for(int i=row-1,j=col+1;i>=0 && j<N;i--,j++) {
            if(board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        return true;


    }
    public void solve(ArrayList<String>board, int row) {
        if(row>=N) {
            result.add(new ArrayList<>(board));
            return;

        }

        for(int col=0;col<N;col++) {
            if(isValid(board,row,col)) {
                StringBuilder sb=new StringBuilder(board.get(row));
                sb.setCharAt(col,'Q');
                board.set(row,sb.toString());

                solve(board,row+1);
                sb.setCharAt(col,'.');
                board.set(row,sb.toString());
            }

        }

    }
    public List<List<String>> solveNQueens(int n) {
        N=n;
        ArrayList<String> board = new ArrayList<>();
        for(int i=0;i<N;i++) {
            board.add(".".repeat(n));
        }
        solve(board,0);
        return result;
    }
}