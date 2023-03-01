// https://leetcode.com/problems/integer-to-roman

class Solution {
    
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        
       
        return helper(num,sb);
            
        
    }
    
    public String helper(int num, StringBuilder str){
        if(num == 0){
            return str.toString();
        }   else{
        if(num >= 1 && num <5){
             if(num == 4)return helper(num - 4, str.append("IV"));
             else return helper(num - 1, str.append("I"));
        }
        else if(num >= 5 && num <10){
             if(num == 9)return helper(num - 9, str.append("IX"));
             else return helper(num - 5, str.append("V"));
        }
        else if(num >= 10 && num <50){
             if(num  / 10  == 4)return helper(num - 40, str.append("XL"));
             else return helper(num - 10, str.append("X"));
        }
        else if(num >= 50 && num < 100){
            if(num /10 == 9)return helper(num - 90, str.append("XC"));
            else return helper(num - 50, str.append("L"));
        }
        else if(num >= 100 && num < 500){
            if(num /100 == 4)return helper(num - 400, str.append("CD"));
            else return helper(num - 100, str.append("C"));
        }
        else if(num >= 500 && num < 1000){
            if(num /100 ==  9)return helper(num - 900, str.append("CM"));
            else return helper(num - 500, str.append("D"));
        }
        else if(num >= 1000){
            return helper(num - 1000, str.append("M"));
        }
        
        return "-1";
        }  
        
    }   
}
            
    