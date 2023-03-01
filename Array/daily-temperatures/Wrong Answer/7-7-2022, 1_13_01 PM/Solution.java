// https://leetcode.com/problems/daily-temperatures

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> stack = new Stack();
        int[] output = new int[temperatures.length];
        for(int i = temperatures.length - 1; i >= 0;i--){
            stack.push(temperatures[i]);
            
        }
        ArrayList<Integer> a  = new ArrayList<>();
        int start = 1;
        while(!stack.isEmpty()){
            int days = 0;
            int curr = stack.pop();
           
            for(int i = start; i < temperatures.length;i++){
                days = days + 1;
                if(temperatures[i] > curr){
                    a.add(days);
                    break;
                }
                else if(days > stack.size()){
                    a.add(0);
                    break;
                }
            }
            start = start +1;
        }
        
        int k = 0;
        for(Integer i : a){
           
                output[k] = i;
                k++;
        }
        return output;
        
    }
}