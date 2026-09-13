class Solution {
    static int n;
    static Boolean dp[];
    public boolean solve(int i, String s,List<String> wordDict){
        if(i==n) {
            return true;
        }
        if(dp[i]!=null){
            return dp[i];
        }

        for(int l=i+1;l<=n;l++) {
            String temp=s.substring(i,l);
            if(wordDict.contains(temp) && solve(l,s,wordDict)){
                return dp[i]=true;
            }
        }
        return dp[i]=false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        n=s.length();
        dp=new Boolean[n];
        return solve(0,s,wordDict);

        
    }
}