class Solution {
public List<Integer> findDuplicates(int[] nums) {
    
    List<Integer> result=new ArrayList<>();
    
    for (int num=0;num<nums.length;num++){
        //element is treated as index
        int index=Math.abs(nums[num])-1;           // <--------------------------------------------------     
        if(nums[index]<0){                                                                    //        |           
            result.add(index+1); // if theelementis being repeated add to the result list     //        |
        }                                                                                      //       |
        nums[index]=nums[index] * -1; //Change the visited number to negative----------------------------

    }
    return result;
        }
}
