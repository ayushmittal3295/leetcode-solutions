class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        int maxE1=0;
        for(int x:nums) {
            maxE1=Math.max(maxE1,x);
        }

        int T=1;
        while(T<=maxE1) {
            T<<=1;
        }

        boolean[]s1=new boolean[T];
        boolean[]s2=new boolean[T];

        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                s1[nums[i]^nums[j]]=true;
            }
        }

        for(int i=0;i<T;i++) {
            if(!s1[i]) continue;

            for(int num:nums) {
                s2[i^num]=true;
            }
        }

        int res=0;
        for(boolean b:s2) {
            if(b) {
                res++;
            }
        }
        return res;
        
    }
}