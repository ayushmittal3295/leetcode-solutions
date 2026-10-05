class Solution {
    public static boolean power(int n) {
       if(n<=0) return false;
       while(n%2==0) {
        n/=2;
       }
       return n==1;
    }
    public int countPairs(int[] ans) {
        int n=ans.length;
        long count=0;
        int sum=0;
        int MOD=1000000007;
        HashMap<Integer, Integer>mp=new HashMap<>();
        int m=ans.length;
        for(int i=0;i<m;i++) {
            for(int j=0;j<=21;j++) {
                int p=1<<j;
                int req=p-ans[i];

                if(mp.containsKey(req)) {
                    count+=mp.get(req);
                }
            }
            mp.put(ans[i],mp.getOrDefault(ans[i],0)+1);
           
        }
        return (int)(count % MOD);

        
        
    }
}