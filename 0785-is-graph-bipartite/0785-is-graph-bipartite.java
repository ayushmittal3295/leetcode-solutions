class Solution {
    Queue<Integer>q;
    int[]color;
    public boolean bfs(ArrayList<ArrayList<Integer>>res, int curr, int currColor, int[]color) {
        color[curr]=currColor;
        q.add(curr);
        while(!q.isEmpty()) {
            int u=q.poll();

            for(int v:res.get(u)) {
                if(color[v]==color[u]) {
                    return false;
                }else if(color[v]==-1) {
                    color[v]=1-color[u];
                    q.add(v);
                    
                }
            }
            
        }
        return true;

    }

    public boolean isBipartite(int[][] graph) {
        q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n=graph.length;
        color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++) {
            res.add(new ArrayList<>());
        }

        // for(int[]g:graph) {
        //     int u=g[0];
        //     int v=g[1];

        //     res.get(u).add(v);
        //     res.get(v).add(u);
        // }

        for(int u=0;u<n;u++) {
            for(int v:graph[u]) {
                res.get(u).add(v);
            }
        }


        for(int i=0;i<n;i++) {
            if (color[i] == -1) {
                if (bfs(res, i, 0, color) == false) {
                    return false;
                }
            }
        }
        return true;
    }
}