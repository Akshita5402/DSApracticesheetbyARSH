class Solution {
    public boolean isPossible(long[] a, long[] b, int n,long k) {
        Arrays.sort(a);
        Arrays.sort(b);
        int len=b.length-1;
      for(int i=0;i<n;i++){
      //      for(int j=len;j>-1;j++){
        
                if (a[i]+b[n-1-i]<k) {
                    return false;
                }
               
      }
        
        return true;
    }
}
