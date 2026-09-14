class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int r1X1=rec1[0];
        int r1Y1=rec1[1];
        int r1X2=rec1[2];
        int r1Y2=rec1[3];

        int r2X1=rec2[0];
        int r2Y1=rec2[1];
        int r2X2=rec2[2];
        int r2Y2=rec2[3];

        if(r2X1>=r1X2) {
            return false;
        }

        if(r2Y1>=r1Y2) {
            return false;
        }

        if(r1X1>=r2X2) {
            return false;
        }

        if(r2Y2<=r1Y1) {
            return false;
        }
        return true;



    }
   
}