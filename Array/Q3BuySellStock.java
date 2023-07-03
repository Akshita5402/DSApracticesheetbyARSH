//brute force o(n^2)

class Solution {
    public int maxProfit(int[] prices) {
        int diff;
        // int prices[]={7,1,5,3,6,4};
       
        diff=0;
        for(int i=0;i<prices.length;i++){//lowest
        
            for(int j=i+1;j<prices.length;j++){//highest
                if(prices[i]<prices[j]){
                  if(diff<prices[j]-prices[i]){
                     diff=prices[j]-prices[i];
                
            }
                }
            }
        }   
    return diff;
    }
}

//optimised approach o(n) space=o(1)

// we can also take an aux array but fr usme space complexity o(n^2) hojayegi
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=prices[0];
        
            for(int i=1;i<prices.length;i++){
                if(min>prices[i]){
                    min=prices[i];
                }

                if(prices[i]-min>profit){
                    profit=prices[i]-min;
                    }
                }
                return profit; 

    }
}    

            
           

   
