class Solution {
    public boolean validPalindrome(String s) {
        int j=s.length()-1;
        int i=0;
        while(i<j){
            if (s.charAt(i)!=s.charAt(j)){
                
                   return checkpalindrome(s,i,j-1)||checkpalindrome(s,i+1,j);}
                 i++;
            j--;
        
           
        }
             
            return true;
        
        
        
    }
    public boolean checkpalindrome(String s,int i,int j){

        while(i<j){
            if (s.charAt(i)!=s.charAt(j)){
                
                return false;}
            

        
            i++;
            j--;
        }
        return true;
        
            
    }
}
