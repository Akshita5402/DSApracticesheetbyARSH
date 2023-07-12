class Solution {
    public int maxScore(int[] points, int k) {
        int total=0;
        int maxtotal=0;
        for(int i=0;i<k;i++){
            total=total+points[i];
        }
        maxtotal=total;
        for(int i=k-1, j=points.length-1;i>=0;i--,j--){ //sliding widow from right to left   <------------------
            total=total+points[j]-points[i];
            maxtotal=Math.max(total,maxtotal);
        }

       



        return maxtotal;
        
    }
}
