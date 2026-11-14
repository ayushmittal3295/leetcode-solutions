class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        //variable size sliding window technique with tc 0(n)
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int j=0;
        int sum=0;
        for(int i=0;i<n;i++) {
            sum+=nums[i];
            while(sum>=target) {
                int l=i-j+1;
                min=Math.min(min,l);
                sum=sum-nums[j];
                j++;
            }
        }
        if(min==Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}