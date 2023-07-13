
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
       // int value=Math.ceil(nums.length/2);
       if(nums.length==1){
           return nums[0];
       }
       if(nums.length==0){
           return -1;
       }
        
        int reqno=0;
        
int maxno=0;
        for (int i=0;i<nums.length;i++){
            int counter=1;
            
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){

                    counter++; // checking for every single element and counting its occurence
                    if(maxno<counter){
                reqno=nums[j];

                }
            }
            maxno=Math.max(counter,maxno);
             // if the value gets updated then we update the required number
            }

        }

    return reqno;
        
    }
}
