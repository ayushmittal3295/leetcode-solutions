class Solution {
    public int countEven(int num) {
        int ans=0;
        for(int i=2;i<=num;i++) {
            int ds=0;
            int n=i;
            while(n>0) {
                int d=n%10;
                ds+=d;
                n/=10;
            }
            if(ds%2==0) {
                ans++;
            }
        }
        return ans;

    }
}