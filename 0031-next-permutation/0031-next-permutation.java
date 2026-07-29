class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int gola_index=-1;
        for(int i=n-1;i>0;i--) {
            if(nums[i-1]<nums[i]) {
                gola_index=i-1;
                break;
            }
        }

        if(gola_index!=-1) {
            int swap_index=gola_index;
            for(int j=n-1;j>0;j--) {
                if(nums[j]>nums[gola_index]) {
                    swap_index=j;
                    break;
                }
            }
            int temp=nums[swap_index];
            nums[swap_index]=nums[gola_index];
            nums[gola_index]=temp;
        }
        

        rev(nums,gola_index+1,n-1);
        
    }

    public void rev(int[]nums,int l,int r) {
        while(l<r)  {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        
        
    }
}