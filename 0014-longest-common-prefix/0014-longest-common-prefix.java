class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String lcp=strs[0];
        for(int i=1;i<n;i++) {
            while(!strs[i].startsWith(lcp)) {
                lcp=lcp.substring(0,lcp.length()-1);
            }
        }
        return lcp;

    }
}