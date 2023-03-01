// https://leetcode.com/problems/add-digits

class Solution {
    public int addDigits(int num) {
        if(num >= 0 && num <= 9){
            return num;
        }
        String s = Integer.toString(num);
        return add(s);
        
    }
    private int add(String num){
        if(num.length() == 1){
           return Integer.parseInt(num);
        }
        else{
            int s = 0;
            for(int i = 0;i<num.length();i++){
               s += num.charAt(i)-'0';
            }
            return add(Integer.toString(s));
        }
    }
}