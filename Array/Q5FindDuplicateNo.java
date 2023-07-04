// YE WALA APPROACH ARRAY SORT KRTAA H SO NOT GOOD ONE
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






















// floyd tortoise approach


import java.util.Arrays;
class Solution {
    public int findDuplicate(int[] nums) {

        int fast=0, slow=0;
        int check=0;
//floyd tortoise approach
        while(true){
            //treating the elements of array as index no
            //index= n+!, elements=1...n

            slow=nums[slow]; //1 step
            fast=nums[nums[fast]]; //2 steps

            if (slow==fast){  //loop breaks when both meets
                break;
            }

        }

        while(true){
            slow=nums[slow];// both slow and check hops 1 step
            check=nums[check];

            if(slow==check){ // both of them will meet after travelling equal dist
                break;
            }
        }
    return check;
    }
}

