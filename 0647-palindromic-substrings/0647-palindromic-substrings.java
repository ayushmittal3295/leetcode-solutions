class Solution {
    String ans="";
    int count=0;
    public int countSubstrings(String s) {
        int n = s.length();
        for(int i=0;i<n;i++) {
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return count;
        
        
    }

    public void expand(String s, int l ,int r) {
        while(l>=0 && r<s.length()&& s.charAt(l)==s.charAt(r)) {
            count++;
            l--;
            r++;
           
        }
       
    }
}