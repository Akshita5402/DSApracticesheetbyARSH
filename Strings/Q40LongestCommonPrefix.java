class Solution {
    public String longestCommonPrefix(String[] strs) {
        int c=0;
        Arrays.sort(strs);//a........z
        String fword=strs[0];
        String lword=strs[strs.length-1];
        while(c<fword.length()){
            if(fword.charAt(c)==lword.charAt(c)){// check for frst and last character only
                c++;// gives index till where the string is same
                
            }
            else{
                break;
            }
        }

        if(c==0 || strs.length==0){
            return "";

        }
        else{
            return fword.substring(0,c);
        }
        
    }
}
