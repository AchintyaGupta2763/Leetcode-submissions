class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else{
                int curr = prices[i]-minPrice;
                max = max>curr?max:curr;
            }
        }
        return max;        
    }
}
