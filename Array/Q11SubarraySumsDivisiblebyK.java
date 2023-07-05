class Solution {
    // method to find the number of subarrays whose sum is divisible by k
    public int subarraysDivByK(int[] nums, int k) {
        int final_result=0; // no of desired arrays so far encountered
        int[] cumm_frequency=new int[k]; // no of times the remainder is encountered
        int remainder=0; // actual remainder
        cumm_frequency[0]=1;

        for (int num:nums){
            remainder=(remainder+num%k+k)%k;
            final_result = final_result + cumm_frequency[remainder];
            cumm_frequency[remainder] = cumm_frequency[remainder] + 1;
        }
        
        return final_result;
    }
}


/*

Initial state:
- `nums = [4, 5, 0, -2, -3, 1]`
- `K = 5`
- `count = [1, 0, 0, 0, 0]`
- `prefix = 0`
- `res = 0`

1. Iteration 1: `num = 4`
   - `prefix = (0 + 4 % 5 + 5) % 5 = 4`
   - `res = 0 + count[4] = 0 + 0 = 0`
   - `count[4] = 0 + 1 = 1`

2. Iteration 2: `num = 5`
   - `prefix = (4 + 5 % 5 + 5) % 5 = 4`
   - `res = 0 + count[4] = 0 + 1 = 1`
   - `count[4] = 1 + 1 = 2`

3. Iteration 3: `num = 0`
   - `prefix = (4 + 0 % 5 + 5) % 5 = 4`
   - `res = 1 + count[4] = 1 + 2 = 3`
   - `count[4] = 2 + 1 = 3`

4. Iteration 4: `num = -2`
   - `prefix = (4 + (-2) % 5 + 5) % 5 = 2`
   - `res = 3 + count[2] = 3 + 0 = 3`
   - `count[2] = 0 + 1 = 1`

5. Iteration 5: `num = -3`
   - `prefix = (2 + (-3) % 5 + 5) % 5 = 4`
   - `res = 3 + count[4] = 3 + 3 = 6`
   - `count[4] = 3 + 1 = 4`

6. Iteration 6: `num = 1`
   - `prefix = (4 + 1 % 5 + 5) % 5 = 0`
   - `res = 6 + count[0] = 6 + 1 = 7`
   - `count[0] = 1 + 1 = 2`

After the loop, the value of `res` is 7, which represents the total count of subarrays in `nums` whose sum is divisible by `K = 5`.

*/
