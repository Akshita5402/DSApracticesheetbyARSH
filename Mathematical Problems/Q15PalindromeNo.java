class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x!=0 && x%10 ==0 ) return false;

        
        int a=0;
    


        while(x>a){
            a=a*10+x%10;
            x/=10;

        }

        return (x==a||x==a/10);// x==a/10 kyukiii odd no wle like 121 where x=1 and a=12 so we remoe last  wla
    }
}
