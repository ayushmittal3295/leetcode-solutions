class Solution {
    public int GCD(int a, int b) {
        if(b==0) {
            return a;
        }
        return GCD(b,a%b);
    }

    public int LCM(int a, int b) {
        if(a==0 || b==0) {
            return 0;
        }
        return Math.abs(a*b)/GCD(a,b);
    }


    public int maxLength(int[] nums) {
        int n=nums.length;
        int maxLen=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int prod=1;
            int gcd=nums[i];
            int lcm=nums[i];
            for(int j=i;j<n;j++) {
                prod*=nums[j];
                gcd=GCD(gcd,nums[j]);
                lcm=LCM(lcm,nums[j]);
                if(prod==gcd*lcm) {
                    maxLen=Math.max(maxLen,j-i+1);
                }

            }
        }
        return maxLen;

    }
}