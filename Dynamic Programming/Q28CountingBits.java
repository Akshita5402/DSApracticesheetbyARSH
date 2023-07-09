class Solution {
    public int[] countBits(int n) {
        int [] result= new int[n+1];

        for(int i=1;i<=n;i++){
            if(i%2==0){
                result[i]=result[i>>1]; // converts i to binary then shifts 1 bit to right then converts back to decimal... basically its dividing it to its half
            }
            else{
                result[i]=result[i>>1]+1;
            }
        }
        return result;
    }
}
