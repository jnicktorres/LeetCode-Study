// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        int currLowest = prices[0];
        int p = 0;       
        for(int i =0; i<prices.length;i++){
            if(prices[i]<currLowest){
                currLowest = prices[i];
            }
            else if(prices[i] - currLowest > profit){
                p = prices[i]-currLowest;                
            }            
        }
        
        return p;
    }
}