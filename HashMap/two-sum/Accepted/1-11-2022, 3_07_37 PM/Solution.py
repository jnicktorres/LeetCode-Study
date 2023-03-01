// https://leetcode.com/problems/two-sum

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hash_map = {}
        
        for x in range(len(nums)):
            if nums[x] in hash_map:
                       return [x, hash_map[nums[x]]]
            else:
                       hash_map[target-nums[x]] = x
                       
                       