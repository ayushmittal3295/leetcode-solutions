class Solution {
    static int n;
    int leftM[];
    int rightM[];
    public int[] leftMax(int[]height) {
        leftM[0]=height[0];
        for(int i=1;i<n;i++) {
            leftM[i]=Math.max(leftM[i-1],height[i]);
        }
        return leftM;
    }
    
    public int[] rightMax(int[]height) {
        rightM[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--) {
            rightM[i]=Math.max(rightM[i+1],height[i]);
        }
        return rightM;
    }


    public int trap(int[] height) {
        n=height.length;
        leftM=new int[n];
        rightM=new int[n];
        leftMax(height);
        rightMax(height);
        int sum=0;
        for(int i=0;i<n;i++) {
            int w=1;
            int h=Math.min(leftM[i],rightM[i])-height[i];

            sum+=h;
        }
        return sum;
        
        
    }
}