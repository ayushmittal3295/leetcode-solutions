class Solution {
    public void dfs(int start, ArrayList<ArrayList<Integer>>res,boolean[]vis) {
        vis[start]=true;
        for(int v:res.get(start)) {
            if(!vis[v]) {
                dfs(v,res,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int m=isConnected[0].length;
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        boolean[]vis=new boolean[n];
        for(int i=0;i<n;i++) {
            res.add(new ArrayList<>());
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isConnected[i][j]==1) {
                    res.get(i).add(j);
                    res.get(j).add(i);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,res,vis);
                count++;
            }
        }

        return count;

    }
}