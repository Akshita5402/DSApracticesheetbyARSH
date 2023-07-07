class Solution {
    public int kthFactor(int n, int k) {
        int[] factors=new int[n];
     // {0,0,0,0,..............n0s}
        int findex=0;
        for (int i=1;i<=n;i++){

            if(n%i==0){
                factors[findex]=i; //find all the factors
                findex++;
            }
        
        }
        if(factors[k-1]!=0){ // the array will be of size n so if there are 0s that means there is no factor at k-1 place
            return factors[k-1];
        }
        else{
            return -1;
        }
        
    }
}
