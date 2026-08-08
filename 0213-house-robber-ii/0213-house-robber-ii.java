class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int case1=fxn(nums,1,n-1);
        int case2=fxn(nums,0,n-2);
        return Math.max(case1, case2);

        
    }

    public int fxn(int[]nums, int s, int e) {
        int r=0;
        int l=0;
        for(int i=s;i<=e;i++) {
            int curr=Math.max(l,nums[i]+r);
            r=l;
            l=curr;
        }

        return l;
        
    }
    
}