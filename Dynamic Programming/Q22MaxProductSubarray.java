class Solution {
    public int maxProduct(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int ans=nums[0];        

        for(int i=1;i<nums.length;i++){ 
            if (nums[i]<0){ // if -ve value is encountered then max<min cox -100*-100=10000 and -100*100=-10000 so exchange them
                int temp=max;
                max=min;
                min=temp;
            }

        max= Math.max(nums[i],nums[i]*max); 
        min= Math.min(nums[i],nums[i]*min);

        ans=Math.max(ans,max); // max product encountered so far in subarray

            }
            
            return ans;
        
    }
}
