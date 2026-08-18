class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>ans=new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;

        for(int i=0;i<n;i++){
            ans.add(nums1[i]);
        }

        for(int i=0;i<m;i++){
            ans.add(nums2[i]);
        }

        int size=ans.size();
        int result[]=new int[size];
        for(int i=0;i<size;i++){
            result[i]=ans.get(i);
        }
        Arrays.sort(result);
        if (size % 2 == 1){
            return result[size / 2];
        }
        return (result[(size / 2) - 1] + result[size / 2]) / 2.0;
    }
}
