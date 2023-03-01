// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        
        int currLow = prices[0];
        int currHigh = 0;
        int sellIndex = 0;
        
        for(int i= 0;i < prices.length;i++){
            if(currLow>prices[i] && i != prices.length-1){
                currLow = prices[i];
                sellIndex = i;
                
            }
                 
        }
        for(int i=sellIndex;i < prices.length;i++){
            if(currHigh<prices[i]){
                currHigh = prices[i];
                
            }
                 
        }
        
        
        return currHigh-currLow;
    }
}