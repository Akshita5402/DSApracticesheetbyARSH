class Solution {
    public int minMoves(int[] nums) {
       Arrays.sort(nums);
int sum=0;  
       for(int i=0;i<=nums.length-1;i++){
           sum=sum+Math.abs(nums[i]-nums[0]);  //distance betweeen 1st next element
       } 


      return sum;  
    }
}
