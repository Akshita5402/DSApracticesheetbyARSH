class Solution {
    public int reverse(int x) {
        long remainder=0;
        while(x!=0){
            remainder=remainder*10+x%10;
            x/=10;
        }

    if(remainder>=Integer.MIN_VALUE && remainder<= Integer.MAX_VALUE){
    return (int)remainder;}
    else{
        return 0;
    }
        
    }
}
