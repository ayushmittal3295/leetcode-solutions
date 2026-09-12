class Solution {
    static int n;
    static int dp[];
    public int solve(int i, String s, int n) {
        if(i==n) {
            return 1;
        }

        if(dp[i]!=-1) {
            return dp[i];
        }

        if(s.charAt(i)=='0') {
            return 0;
        }

        int take_1_char=solve(i+1,s,n);
        int take_2_char=0;
        if(i+1<n) {
            if(s.charAt(i)=='1'||(s.charAt(i)=='2' && s.charAt(i+1)<='6')) {
                take_2_char=solve(i+2,s,n);
            }
        }
        return dp[i]=take_1_char+take_2_char;
    }
    public int numDecodings(String s) {
        n=s.length();
        dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(0,s,n);
    }
}