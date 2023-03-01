// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
       
        int currmax = 0;
        int price = prices[0];
        
        for(int i = 1; i < prices.length;i++){
            if(prices[i] < price){
                price = prices[i];
              }
            else if(prices[i] - price > currmax){
                currmax = prices[i] - price;
            }      
            
        }
        return currmax;
    }
}