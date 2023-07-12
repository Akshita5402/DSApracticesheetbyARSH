class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        int cumsum=0;
        int count=0;

      //a=x+y---------------> x=a-y

        for (int i=0;i<nums.length;i++){
            cumsum+=nums[i];
            if(map.containsKey(cumsum-k)){
                count+=map.get(cumsum-k);
            }
            map.put(cumsum,map.getOrDefault(cumsum,0)+1);
        }
        return count;

        
    }
}
