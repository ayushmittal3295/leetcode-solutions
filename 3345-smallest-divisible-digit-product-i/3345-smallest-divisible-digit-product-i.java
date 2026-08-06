class Solution {
    public int smallestNumber(int n, int t) {
        while(true) {
            int prod=1;
            int no=n;
            while(no>0) {
                prod*=no%10;
                no/=10;

            }
            if(prod%t==0){
                return n;
            }
            n++;
        }
        

        
    }
}