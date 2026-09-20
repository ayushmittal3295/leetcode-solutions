class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        HashMap<Character, Integer>mp=new HashMap<>();
        for(char ch='a';ch<='z';ch++) {
            mp.put(ch,'z'-ch+1);
        }
        for(int i=1;i<=n;i++){
            sum+=i*mp.get(s.charAt(i-1));
        }
        return sum;
        
    }
}