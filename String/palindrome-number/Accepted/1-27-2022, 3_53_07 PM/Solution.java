// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        String intStr = Integer.toString(x);
        String rev = "";
        int n = intStr.length();
        if(x < 0){
            return false;
        }
        for(int i = n-1; i >= 0;i-- ){
            rev = rev + intStr.charAt(i);
        }
        
        if(rev.equals(intStr)){
            return true;
        }
        
        return false;
    }
}