class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;

        for(int i=1;i<prices.length;i++){

            if(prices[i]>prices[i-1]){ // agar kal stock gira tha aj utha hua h to profit m add krdo
                profit=profit+prices[i]-prices[i-1]; //sare profit ko add krte jao
            }
        }




    return profit;

    }
}
