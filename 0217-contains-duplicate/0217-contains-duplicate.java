class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer>s=new HashSet<>();
        for(int num:nums) {
            if(!s.add(num)) {
                return true;
            }
        }
        return false;
        
    }
}