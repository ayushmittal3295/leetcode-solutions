class Solution {
    static int n;
    static List<List<Integer>>list;
    static List<Integer>ans;
    static HashSet<List<Integer>> hash;
    public void getAllComb(int[] arr, int i, int target) {
        if(i==n || target<0) {
            return;
        }
        if(target==0) {
            List<Integer> temp = new ArrayList<>(ans);
            // list.add(new ArrayList<>(ans));
            if (hash.add(temp)) {
                list.add(temp);
            }

            return;
        }
        ans.add(arr[i]);
        getAllComb(arr,i+1,target-arr[i]);
        getAllComb(arr,i,target-arr[i]);
        ans.remove(ans.size()-1);
        getAllComb(arr,i+1,target);
    }
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        n=arr.length;
        list=new ArrayList<>();
        ans=new ArrayList<>();
        hash=new HashSet<>();
        getAllComb(arr,0,target);
        return list;
        
    }
}