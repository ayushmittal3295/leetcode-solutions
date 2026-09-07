class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // int n=times.length;
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++) {
            adj.add(new ArrayList<>());
        }

        for(int[]t:times) {
            int u=t[0];
            int v=t[1];
            int w=t[2];

            adj.get(u).add(new int[]{v,w});
        }

        int[]dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);

        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        dist[k]=0;
        pq.add(new int[]{0,k});
        while(!pq.isEmpty()) {
            int[]curr=pq.poll();
            int distance=curr[0];
            int node=curr[1];
            if (distance>dist[node]) {
                continue;
            }

            for(int[]neighbour:adj.get(node)) {
                int newNode=neighbour[0];
                int weight=neighbour[1];
                if(distance+weight<dist[newNode]) {
                    dist[newNode]=distance+weight;
                    pq.add(new int[]{dist[newNode],newNode});
                }

            }
        }
        int max=0;
        for(int i=1;i<=n;i++) {

            if(dist[i] == Integer.MAX_VALUE) {
                return -1;
            }
            if(dist[i]>max) {
                max=dist[i];
            }
        }
        return max;
    }
}