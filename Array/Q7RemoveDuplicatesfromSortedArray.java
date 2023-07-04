class Solution {
    public int removeDuplicates(int[] nums) {

         int uniqueIndex = 1; // jo elements same hunge unhe ignore krke unique
                            // elements ko  insert krega

        for(int i = 0; i < nums.length - 1; i++) {
            
            if(nums[i] < nums[i + 1]){ //if true, num[i + 1] is a new unique number
              nums[uniqueIndex] = nums[i + 1]; //agar element duplicate nahi hai to use 
                                    // place krega or newindex +1 hoga for other element
              uniqueIndex++;
            }
        }
        return uniqueIndex;
        
    }
}
