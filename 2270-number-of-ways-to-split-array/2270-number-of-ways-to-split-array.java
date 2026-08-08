class Solution {
    public int waysToSplitArray(int[] nums) {
        int count=0;
        int n = nums.length;
        long sum=0;
        long first=0;
        long second=0;
        for(int x:nums) {
            sum+=x;
        }
        for(int i=0;i<n-1;i++) {
            first+=nums[i];
            second=sum-first;


            if(first>=second) {
                count++;
            }

        }
        return count;
    }
}