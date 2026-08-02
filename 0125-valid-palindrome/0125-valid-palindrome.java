class Solution {
    public boolean isPalindrome(String s) {
        String res=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int n = res.length();
        int i=0;
        int j=n-1;
        while(i<j) {
            if(res.charAt(i)!=res.charAt(j)) {
                return false;
            }
            i++;
            j--;


        }
        return true;

        
    }
}