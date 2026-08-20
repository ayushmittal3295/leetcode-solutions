class Solution {
    public int[] resultArray(int[] nums) {
        int n =nums.length;
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int i=2;i<n;i++) {
            if(list1.get(list1.size()-1)>list2.get(list2.size()-1)) {
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }

        ans.addAll(list1);
        ans.addAll(list2);
        int res[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++) {
            res[i]=ans.get(i);
        }
        return res;


    }
}