// https://leetcode.com/problems/missing-number

class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n : nums){
            set.add(n);
        }
        for(int i = 0; i <= nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        
        return -1;
    }
}