class Solution {
    public String addBinary(String a, String b) {
        int carry=0;
         StringBuilder s = new StringBuilder();    

        for(int i=a.length()-1,j=b.length()-1;j>=0||i>=0||carry>0;j--,i--){
            int sum=0;
            if(i>=0){
                sum+=a.charAt(i)-'0';
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
            }

            sum+=carry;
            carry=sum/2;
            sum=sum%2;

            s.append(sum);
     

        }
        
             return s.reverse().toString();
        
    }
}
