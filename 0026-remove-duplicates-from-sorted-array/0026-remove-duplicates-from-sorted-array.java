class Solution {
    public int removeDuplicates(int[] nums) {
        // NOT IN PLACE APPROACH
        // LinkedHashSet<Integer>set=new LinkedHashSet<>();
        // for(int i=0;i<nums.length;i++) {
        //     set.add(nums[i]);
        // }
        // int i=0;
        // for(int x:set) {
        //     nums[i]=x;
        //     i++;
        // }
        // return set.size();

        // IN PLACE APPROACH
        int n=nums.length;
        int i=0;
        for(int j=1;j<n;j++) {
            if(nums[i]!=nums[j]) {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}