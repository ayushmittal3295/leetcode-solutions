class Solution {
    public int PrimsAlgo(ArrayList<ArrayList<int[]>>adj,int V) {
        for(int i=0;i<V;i++) {
            adj.add(new ArrayList<>());
        }

        PriorityQueue<int[]>pq=new PriorityQueue<>((a, b)->Integer.compare(a[0],b[0]));
        pq.add(new int[]{0,0});
        boolean[]inMST=new boolean[V];
        int sum=0;
        while(!pq.isEmpty()) {
            int curr[]=pq.poll();
            int wt=curr[0];
            int node=curr[1];
            
            if(inMST[node]) {
                continue;
            }
            inMST[node]=true;
            sum+=wt;
            
            for(int[]temp:adj.get(node)) {
                int neighbour=temp[0];
                int neighbour_wt=temp[1];
                
                if(!inMST[neighbour]) {
                    pq.add(new int[]{neighbour_wt,neighbour});
                }
            }
        }
        return sum;
    }
    public int minCostConnectPoints(int[][] edges) {
        int V=edges.length;
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
        for(int i=0;i<V;i++) {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++) {
            for(int j=i+1;j<V;j++) {
                int x1=edges[i][0];
                int y1=edges[i][1];

                int x2=edges[j][0];
                int y2=edges[j][1];

                int d=Math.abs(x1-x2)+Math.abs(y1-y2);

                adj.get(i).add(new int[]{j,d});
                adj.get(j).add(new int[]{i,d});
            }
        }
        return PrimsAlgo(adj,V);
    }
}