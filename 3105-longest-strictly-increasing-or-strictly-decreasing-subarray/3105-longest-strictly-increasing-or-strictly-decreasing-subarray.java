class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int p=1;
        int q=1;
        int res=1;
        for(int i=1;i<n;i++) {
            if(nums[i]>nums[i-1]) {
                p++;
                q=1;
            } else if(nums[i]<nums[i-1]){
                p=1;
                q++;
            } else {
                p=1;
                q=1;
            }
            res=Math.max(res,Math.max(p,q));
        }
        return res;

    }
}