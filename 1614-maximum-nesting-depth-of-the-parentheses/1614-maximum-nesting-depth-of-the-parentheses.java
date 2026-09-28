class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0, temp = 0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(ch);
                temp++;
            }else if(ch==')'){
                ans = Math.max(ans, temp);
                temp--;
            }
        }

        return ans;
    }
}