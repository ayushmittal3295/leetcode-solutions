class Solution {
    public boolean checkDivisibility(int n) {
        long sum=0;
        long prod=1;
        int or=n;
        while(n>0) {
            int d=n%10;
            prod*=d;
            sum+=d;
            n/=10;
        }
        long s=sum+prod;
        if(or%s==0) {
            return true;
        }
        return false;
    }
}