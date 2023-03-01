// https://leetcode.com/problems/palindrome-number

class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        
        else:
            str_num = str(x)
            reverse_str = ""
            for i in range(len(str_num) - 1,0):
                reverse_str = reverse_str + str_num[i] 
            return reverse_str
            if str_num == reverse_str:
                return True
            else:
                return False