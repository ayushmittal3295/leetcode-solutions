class Solution {
    public int solve(int i, int j, int nums[]) {
        if(i>j) return 0;
        if(i==j) return nums[i];
        int take_i=nums[i]+Math.min(solve(i+2,j,nums),solve(i+1,j-1,nums));
        int take_j=nums[j]+Math.min(solve(i+1,j-1,nums),solve(i,j-2,nums));
        return Math.max(take_i,take_j);
    }
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int ts=0;
        int sp1=solve(0,n-1,nums);
        for(int i=0;i<n;i++) {
            ts+=nums[i];
        }
        int sp2=ts-sp1;
        return sp1>=sp2;


        
    }
}