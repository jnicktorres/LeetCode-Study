// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int currlow = prices[0];
        int max = 0;
        
        for(int i = 1; i < n;i++){
            if(prices[i] < currlow){
                currlow = prices[i];
            }
            
            if(prices[i] - currlow > max){
                max = prices[i] - currlow;
            }
            
        }
        
        return max;
    }
}