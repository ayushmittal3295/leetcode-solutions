class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int m=flights[0].length;
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
        for(int i=0;i<n;i++) {
            adj.add(new ArrayList<>());
        }

        for(int[]f:flights) {
            int u=f[0];
            int v=f[1];
            int w=f[2];

            adj.get(u).add(new int[]{v,w});

        }

        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,src,0});
        int[][] dist=new int[n][k + 2];
        for(int i=0; i<n; i++) {
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        dist[src][0]=0;
        while(!pq.isEmpty()) {
            int[]curr=pq.poll();
            int c=curr[0];
            int node=curr[1];
            int flightsUsed=curr[2];

            if(node==dst) {
                return c;
            }

            if(flightsUsed==k+1) {
                continue;
            }

            for(int[]neighbour:adj.get(node)) {
                int newNode=neighbour[0];
                int weight=neighbour[1];

                int newCost=c+weight;
                int newFlights=flightsUsed+1;

                if(newCost<dist[newNode][newFlights]) {

                    dist[newNode][newFlights]=newCost;

                    pq.add(new int[]{
                        newCost,
                        newNode,
                        newFlights
                    });
                }
            
            }
        }
        return -1;
        
    }
}