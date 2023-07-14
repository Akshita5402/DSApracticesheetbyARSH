class Solution {
    public int strStr(String haystack, String needle) {
        //CUTE SLIDING WINDOW

        int hlen=haystack.length();
        int nlen=needle.length();
        int i=0;
        int j=0;

        while(j<hlen){
            if(j-i+1<nlen){ //sliding window length
            j++;

            }
            else{
                if(haystack.substring(i,j+1).equals(needle)){
                    return i;
                }
                i++;
                j++;
            }
        }
        return -1;        
    }
}
