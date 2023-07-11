class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target=0;
        Arrays.sort(nums);
        Set<List<Integer>> nodupes=new HashSet<>(); // to avoid dupes
        List<List<Integer>> res=new ArrayList<>(); // to store resultt

        for(int i=0;i<nums.length;i++){ // i j k sre the pointers... hit n trial method
            int j=1+i;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                    nodupes.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }

            }
        }
        res.addAll(nodupes);
        return res;


        
    }
}
