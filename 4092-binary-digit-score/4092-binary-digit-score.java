class Solution {
    public int calculateScore(int a, int b) {
        String p=Integer.toBinaryString(a);
        String q=Integer.toBinaryString(b);
        int n=p.length();
        int m=q.length();
        int s1=0;
        int s2=0;
        for(int i=0;i<n;i++) {
            if(p.charAt(i)=='1') {
                s1++;
            }
        }
        for(int i=0;i<m;i++) {
            if(q.charAt(i)=='1') {
                s2++;
            }
        }
        if(s1>=s2) {
            return s1*s2;
        }
        return s2/s1;
        
        
    }
}