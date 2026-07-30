class Solution {
    public int findMin(int[] nums) {
        //O(n)
        // int min=nums[0];
        // int n = nums.length;
        // for(int i=0;i<n;i++) {
        //     if(nums[i]<min) {
        //         min=nums[i];
        //     }
        // }
        // return min;

        //O(logn)
        int n = nums.length;
        int i=0;
        int j=n-1;
        while(i<j) {
            int m=i+(j-i)/2;

            if(nums[m]>nums[j]) {
                i=m+1;
            } else {
                j=m;
            }
        }
        return nums[i];
    }
}