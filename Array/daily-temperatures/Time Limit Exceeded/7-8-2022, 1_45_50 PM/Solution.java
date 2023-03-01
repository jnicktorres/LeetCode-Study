// https://leetcode.com/problems/daily-temperatures

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         Stack<Integer> stack = new Stack();
        int[] output = new int[temperatures.length];
        for(int i = temperatures.length - 1; i >= 0;i--){
            stack.push(temperatures[i]);
            
        }
        ArrayList<Integer> a  = new ArrayList<>();
        int k = 0;
        int start = 1;
        while(!stack.isEmpty()){
            int days = 0;
            int curr = stack.pop();
           
            for(int i = start; i < temperatures.length;i++){
                days = days + 1;
                if(temperatures[i] > curr){
                    output[k] = days;
                    k++;
                    break;
                }
                 if(days > stack.size()-1){
                    
                      output[k] = 0;
                       k++;
                   // System.out.print("The size is " + stack.size());
                    break;
                }
            }
            start = start +1;
        }
        
        return output;
        
        
    }
}