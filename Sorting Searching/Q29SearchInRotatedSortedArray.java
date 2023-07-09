class Solution {
    public int search(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        

        while(lo<hi){
            int mid=(hi+lo)/2;
            if (nums[mid]==target){
                return mid;
            }
    
            

            

            if(nums[lo]<=nums[mid]){
                if(target>=nums[lo] && target<nums[mid]){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }else{//nums[lo]>nums[mid]
                if(target>nums[mid]&& target<=nums[hi]){
                    lo=mid+1;
                } else{// tariget<nums[mid]&& target>nums[hi]
                    hi=mid-1;
                }
            
            }
        }
if (nums[lo]==target){
                return lo;
            }
        else{return -1;}     

    }
}
