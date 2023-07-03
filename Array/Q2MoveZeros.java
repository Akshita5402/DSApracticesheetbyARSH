class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }

        int[] newNums = new int[length];
        int index = 0;
        // simply copy paste krdo array ko except zeros
        //length purane array ke equal to automaticaly bdke elements 0 hojayenge
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                newNums[index] = nums[i];
                index++;
            }
        }

        System.arraycopy(newNums, 0, nums, 0, length);
    }
}
