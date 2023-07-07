class Solution { //FIBONACCI
    public int climbStairs(int n) {
        int one=1;
        int two=1;

        if (n==1||n==2||n==3){
            return n;
        }

        for (int i=0;i<n-1;i++){

            int temp=one;
            one=one+two;
            two=temp;
        }
        return one;
    }
}
