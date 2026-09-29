class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        int index=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            int ds=0;
            int idx=0;
            while(nums[i]>0) {
                int d=nums[i]%10;
                ds+=d;
                idx=i;
                nums[i]/=10;
                
            }

            if(ds==i) {
                index=Math.min(index,idx);
            }
        }
        if(index==Integer.MAX_VALUE) {
            return -1;
        }
        return index;

        
    }
}