class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        s=s.trim();
        int i=0;
        int sym=1;
        int num=0;
        if(s.isEmpty()) return 0;
        if(s.charAt(i)=='-') {
            sym=-1;
            i++;
        } else if(s.charAt(i)=='+') {
            i++;
        }
        
        while(i<s.length() && Character.isDigit(s.charAt(i))) {
            int d=s.charAt(i)-'0';
            
            if(num>(Integer.MAX_VALUE-d)/10) {
                if(sym==1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            num=num*10+d;
            i++;
            
        }
        return num*sym;
    }
}