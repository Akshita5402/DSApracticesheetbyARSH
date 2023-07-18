class Solution {
    public int calculate(String s) {
        int sum=0;
        int last=0;
        int no=0;
        char operator='+';
        char[] ch= s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                no=no*10+ch[i]-'0';
            }
            if(i==ch.length-1|| ch[i]!=' ' && !Character.isDigit(ch[i])){
                if(operator=='+'){ // initialy always starts with +
                    sum+=last;
                    last=no;
                }
                else if(operator=='-'){
                    sum+=last;
                    last=-no;
                }
                else if(operator=='*'){
                    
                    last=last*no;
                }
                else if(operator=='/'){
                    //sum+=last;
                    last=last/no;
                }
                no=0;
                operator=ch[i]; //saving the nect operator
            

            }
        }


       sum=sum+last;
       return sum; 
        
    }
}
