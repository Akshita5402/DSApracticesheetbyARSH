class Solution {
    public boolean isPowerOfTwo(int n) {
       
        if(n==1){return true;}
        if(n==0){return false;}
        

       while(n!=1){
           if(n%2!=0 || n<0){
               return false;

           }

           n=n/2;
//no is divided by 2 and it is divided by 2 again and again to check if it is the power of 2

       }
       return true;
    }
}
