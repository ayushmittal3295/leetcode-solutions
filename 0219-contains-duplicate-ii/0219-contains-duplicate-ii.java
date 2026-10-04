class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer, Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++) {
            if(mp.containsKey(nums[i])) {
                int j=mp.get(nums[i]);
                if(nums[i]==nums[j] && Math.abs(i-j)<=k) {
                    return true;
                }
            }
            mp.put(nums[i],i);
            
        }
        return false;
        
        
    }
}