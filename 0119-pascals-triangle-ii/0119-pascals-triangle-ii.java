class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++) {
            List<Integer>tmp=new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(j==0||j==i) {
                    tmp.add(1);
                } else {
                    tmp.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }
            res.add(tmp);
        }
        return res.get(rowIndex);
    }
}