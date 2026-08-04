class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++) {
            for(int j=nums[i]+1;j<nums[i+1];j++) {
                list.add(j);
            }
        }
        return list;
    }
}