// https://leetcode.com/problems/daily-temperatures

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] ret = new int[size];
        
        for(int i = size - 1; i >= 0; i--){
            for(int j = i - 1; j >= 0 && temperatures[i] > temperatures[j] ; j--){
                ret[j] = i - j;
            }            
        }
        
        return ret;
    }
}