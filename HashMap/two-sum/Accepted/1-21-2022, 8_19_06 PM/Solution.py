// https://leetcode.com/problems/two-sum

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hash = {}
        
        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in hash:
                return [hash[diff],i]
            else:
                hash[nums[i]] = i
        
        