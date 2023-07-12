class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0;i<nums.length-3;i++){
            for (int j=i+1;j<nums.length-2;j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[l];
			if (Math.abs(sum) > Integer.MAX_VALUE) {break;}
                    if(sum==target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                    }
                    else if( sum<target){
                        k++;
                    }
                    else if(sum>target) {l--;}
                }
            }
        }
        List<List<Integer>> result= new ArrayList<>();
        result.addAll(set);
        return result;

        
    }
}

/*EDGECASE

NUMS=[1000000000,1000000000,1000000000,1000000000]
TARGET= -294967296
OUTPUT=[]

used long sum for this*/
