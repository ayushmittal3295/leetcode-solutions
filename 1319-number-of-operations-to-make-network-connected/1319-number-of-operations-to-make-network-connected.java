class Solution {
    static int par[];
    static int rank[];
    public void union(int x, int y) {
        int x_par=find(x);
        int y_par=find(y);
        if(x_par==y_par) {
            return;
        }

        if(rank[x_par]>rank[y_par]) {
            par[y_par]=x_par;
        } else if(rank[y_par]>rank[x_par]) {
            par[x_par]=y_par;

        } else{
            par[x_par]=y_par;
            rank[y_par]++;
        }

    }
    
    public int find(int i) {
        if(i==par[i]) {
            return i;
        }
        return par[i]=find(par[i]);
    }
    public int makeConnected(int n, int[][] connections) {
        int m=connections.length;

        par=new int[n];
        rank=new int[n];
        if(m<n-1) {
            return -1;
        }
        for(int i=0;i<n;i++) {
            par[i]=i;
            rank[i]=0;
        }
        int comp=n;
        for(int c[]:connections) {
            int x_par=find(c[0]);
            int y_par=find(c[1]);
            if(x_par!=y_par) {
                union(c[0],c[1]);
                comp--;
            }
        }
        return comp-1;




    }
}