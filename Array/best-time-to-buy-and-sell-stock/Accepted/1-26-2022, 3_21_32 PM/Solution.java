// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        int currLow = prices[0];
        int profit = 0;
        
        for(int i = 1; i < prices.length;i++){
            if(prices[i] < currLow){
                currLow = prices[i];
            }    
        
            else if(prices[i] - currLow > profit){
                profit = prices[i] - currLow;
            }
            
            
        }
        
        return profit;
        
    }
}