class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int case1 = nums[0]*nums[1]*nums[nums.length-1]; // for negative numbers
        int case2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]; // for positive

        int maxProduct = Integer.max(case1, case2);
        return maxProduct;
    }
}
