class Solution {
    public boolean canJump(int[] nums) {
        int sum=0;

        for(int i=0;i<nums.length;i++){
            if(sum<i){ //path to travel>no of jumps
                return false;
            }

            sum=Math.max(sum,i+nums[i]);// i is where u r and nums[i]+i is max length where u can go
        }
        return true;
        
    }
}
