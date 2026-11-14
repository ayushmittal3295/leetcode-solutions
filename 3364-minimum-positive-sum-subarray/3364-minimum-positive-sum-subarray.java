class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            int sum=0;
            for(int j=i;j<n;j++) {
                sum+=nums.get(j);
                int s=j-i+1;
                if(s>=l && s<=r && sum>0) {
                    min=Math.min(min,sum);
                }
            }
        }
        if(min==Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
}