class Solution {
    public long maxi_num(int n) {
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        while(n>0) {
            pq.add((long)n%10);
            n/=10;
        }
        long num=0;
        while(!pq.isEmpty()) {
            num=num*10+pq.peek();
            pq.poll();
        }
        return num;
    }
    public long maximizeSum(int[] nums, int k) {
        int n=nums.length;
        long sum=0;
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++) {
            long num=maxi_num(nums[i]);
            pq.add(num-nums[i]);
            sum+=nums[i];
        }
        while(k>0) {
            sum+=pq.poll();
            k--;

        }
        return sum;

        
    }
}