class Solution {
    public int removeDuplicates(int[] nums) {
        // NOT IN PLACE APPROACH
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        int i=0;
        for(int x:set) {
            nums[i]=x;
            i++;
        }
        return set.size();
    }
}