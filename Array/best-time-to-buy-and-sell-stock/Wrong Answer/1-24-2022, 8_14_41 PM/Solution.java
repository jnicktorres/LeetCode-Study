// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        
        int currLowest = prices[0];
        int sellIndex = 0;
        int nextHigh = 0;
        
        for (int i = 1; i < prices.length;i++){
            if (currLowest > prices[i]){
                currLowest = prices[i];
                sellIndex = i;
            }
        }        
        
        
    if(sellIndex+1>prices.length){
        return 0;
}
    for(int i = sellIndex+1; i<prices.length;i++){
        if (prices[i]>nextHigh){
            nextHigh = prices[i];            
        }        
        
    }
    
    return (nextHigh - currLowest);
}
}