class Solution {
    String ans="";
    public String longestPalindrome(String s) {
        int n = s.length();
        for(int i=0;i<n;i++) {
            expand(s,i,i);//odd palindrome
            expand(s,i,i+1);//even palindrome
        }
        return ans;


    }
    public void expand(String s, int l, int r) {
        while(l>=0 && r<s.length()&& s.charAt(l)==s.charAt(r)) {
            if(r-l+1>ans.length()) {
                ans=s.substring(l,r+1);
            }
            l--;
            r++;
        }
    }
}