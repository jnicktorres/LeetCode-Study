// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        char[] ar = s.toCharArray();
        for(char c : ar){
            if(c == '(') {
                stack.push('(');
            }
            else if(c == '[') {
                stack.push('[');
            }
            
            else if(c=='{') {
                stack.push('{');
            }
            else if(c == ')' && !stack.empty() && stack.peek() == '('){
                stack.pop();
            }
            else if(c== ']' && !stack.empty() && stack.peek() =='['){
                stack.pop();
            }
            else if(c == '}' && !stack.empty() && stack.peek() == '{'){
                stack.pop();
            }
            
            else{
                return false;
            }
            
            
        }
        
        return stack.empty();
            
            
            
        }
        
    }
