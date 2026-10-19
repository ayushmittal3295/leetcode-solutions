class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        //space taking sol O(n);
        // int ans=0;
        // HashMap<Integer, Integer>mp=new HashMap<>();
        // for(int i=0;i<nums.length;i++) {
        //     mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        //     if(mp.get(nums[i])>1) {
        //         ans=nums[i];
        //     }

        // }
        // return ans;

        int s=nums[0];
        int f=nums[0];
        do{
            s=nums[s];
            f=nums[nums[f]];
        }while(s!=f);
        s=nums[0];

        while(s!=f) {
            s=nums[s];
            f=nums[f];
        }
        return s;




        

        
        
    }
}