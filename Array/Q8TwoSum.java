class Solution {
    public int[] twoSum(int[] nums, int target) {

int f_no=0; //index of 1st
int s_no=0; //index of 2nd
        for (int i=0;i<nums.length;i++){

            int req_no=target-nums[i];         //hr no ko minus krke check kro :|
            for(int j=i+1;j<nums.length;j++){
            if (nums[j]==req_no){
               f_no=i;
                s_no=j;

                break;
            }
            }

            }
            
        int[] arr={f_no,s_no};

    return arr;        
              
    }
}

/*
                    PYTHON CODE 

class Solution(object):
     def twoSum(self, nums, target):
         for num in nums:
             if target - num in nums:
                 try:
                     return [nums.index(num), nums.index(target-num, nums.index(num)+1)]
                 except:
                     continue








*/







