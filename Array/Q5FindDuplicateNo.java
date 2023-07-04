// medium level but easy h
import java.util.Arrays;
class Solution {
    public int findDuplicate(int[] nums) {

        Arrays.sort(nums); // array ko sort krlo isse bs agal bagal wle integers ko compare krna pdega
        int repeated_no=0;

        for (int i=0;i<nums.length-1;i++){//-1 isliye kyuki i ko i+1 s compare krna h
            if(nums[i]==nums[i+1]){
                repeated_no=nums[i];
                break;
            }

        
        }
        return repeated_no;
        
        
    }
}
