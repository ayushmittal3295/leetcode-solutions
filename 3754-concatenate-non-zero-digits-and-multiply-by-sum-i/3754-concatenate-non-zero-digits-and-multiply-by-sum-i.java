class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        StringBuilder sb = new StringBuilder();
        long sum=0;
        long x=0;
        while(n>0) {
            long d=n%10;
            if(d!=0) {
                sb.append(d);
                sum+=d;
            }
            n/=10;
        }
        sb.reverse();
        x=Long.parseLong(sb.toString());
        return x*sum;
    }
}