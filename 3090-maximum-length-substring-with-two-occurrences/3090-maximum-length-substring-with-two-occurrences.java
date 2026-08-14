class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int ml=0;
        for(int i=0;i<n;i++) {
            int freq[]=new int[256];
            for(int j=i;j<n;j++) {
                char ch=s.charAt(j);
                freq[ch]++;
                if(freq[ch]>2) break;

                ml=Math.max(ml,j-i+1);
            }
            

        }
        return ml;
        
    }
}