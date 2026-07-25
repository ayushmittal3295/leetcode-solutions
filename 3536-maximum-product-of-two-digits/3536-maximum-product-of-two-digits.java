class Solution {
    public int maxProduct(int n) {
        int lar=-1;
        int secl=-1;
        while(n>0) {
            int d=n%10;
            if(d>lar) {
                secl=lar;
                lar=d;
            } else if(d>secl) {
                secl=d;
            }
            n/=10;
        }
        return lar*secl;
    }
}