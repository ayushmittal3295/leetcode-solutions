class Solution {
    public boolean canAliceWin(int n) {
        int i=10;
        while(n>=i) {
            n=n-i;
            i=i-1;
        }
        return i%2==1;
        
        

    }
}