class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min=prices[0];
        int maxP=0;
        for(int i=1;i<n;i++) {
            min=Math.min(min,prices[i]);
            maxP=Math.max(maxP,prices[i]-min);
        }
        return maxP;
        
    }
}