class Solution {
    Queue<Integer>q;
    boolean[]vis;
    public void bfs(int start, ArrayList<ArrayList<Integer>>res,boolean vis[]) {
        vis[start]=true;
        q.add(start);
        while(!q.isEmpty()) {
            int node=q.poll();
            for(int v:res.get(node)) {
                if(!vis[v]) {
                    vis[v]=true;
                    q.add(v);
                }
            }
        }
        

        
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int m=isConnected[0].length;
        vis=new boolean[n];
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        q=new LinkedList<>();
        for(int i=0;i<n;i++) {
            res.add(new ArrayList<>());
        }
        int count=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(isConnected[i][j]==1) {
                    res.get(i).add(j);
                    res.get(j).add(i);
                }
            }
        }


        for(int i=0;i<n;i++) {
            if(!vis[i]) {
                bfs(i,res,vis);
                count++;
            }
        }
        return count;
        

    }
}