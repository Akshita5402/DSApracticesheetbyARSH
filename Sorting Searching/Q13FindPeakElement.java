
                                //BINARY SEARCH




class Solution {
    public int findPeakElement(int[] nums) {
        
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int m= l+ (h-l) / 2;
            if (nums[m+1]<nums[m]){ //aage wla chota h... inc order
            h=m;
            }
            else if(nums[m+1]>nums[m] ){// age wla bda h... dec order
                l=m+1;
            }
  
        }
        return l;
        
    }
}
