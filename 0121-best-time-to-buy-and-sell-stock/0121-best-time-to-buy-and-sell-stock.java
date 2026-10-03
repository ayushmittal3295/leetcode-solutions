class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int p=0;
        int mp=prices[0];
        for(int i=1;i<n;i++) {
            max=Math.max(max,prices[i]-mp);
            mp=Math.min(mp,prices[i]);
        }
        return max;
        
        
    }
}