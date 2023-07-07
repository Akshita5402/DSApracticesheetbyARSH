import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int max_no=nums.length;
        int sum=0;

        for(int i=0;i<max_no;i++){
            sum=sum+i;
            sum=sum-nums[i];
            // jo bhi missing no hoga wo sum ko -ve krdega
            }
            sum=sum+max_no;
            // length me s minus krne p no pta lggjayega
            
        return sum;
        
        }

        
        
    }
