// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        String[] sArr = s.split("");
        
        for(int i = 0; i < sArr.length;i+=2){
            if(sArr[i] == "(" && sArr[i+1] != ")"){
                return false;
            }
            else if (sArr[i] == "{" && sArr[i+1] != "}"){
                return false;
        }
        else if (sArr[i] == "[" && sArr[i+1] != "]"){
                return false;
        }
        }
        return true;
    
}
}