class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        HashMap<Integer, Integer>mp=new HashMap<>();
        ArrayList<Integer>adj=new ArrayList<>();
        for(int i=0;i<n;i++) {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(mp.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for(int i=list.size()-1;i>=list.size()-k;i--) {
            adj.add(list.get(i).getKey());
        }
        int m=adj.size();
        int ans[]=new int[m];
        for(int i=0;i<m;i++) {
            ans[i]=adj.get(i);
        }
        return ans;


        

    }
}