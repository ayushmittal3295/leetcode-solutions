class Solution {
    public int findKthPositive(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        int num=1;
        while(i<n&&k>0) {
            if(nums[i]==num) {
                i++;
            } else {
                k--;
            }
            num++;
        }

        while(k>0) {
            num++;
            k--;
        }
        return num-1;

    }
}