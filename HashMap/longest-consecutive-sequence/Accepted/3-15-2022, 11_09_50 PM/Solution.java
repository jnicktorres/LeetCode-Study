// https://leetcode.com/problems/longest-consecutive-sequence

class Solution {
    public int longestConsecutive(int[] nums) {
        
        
        
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int n : nums){
            hash.add(n);
        }
        int max= 0;
        for(int i = 0; i < nums.length;i++){
            int currNum = nums[i];
            int seq = 1;
            if(!hash.contains(currNum-1)){
            while(hash.contains(currNum+1)){
                currNum++;
                seq++;
            }
            }
            
            max = Math.max(max,seq);
        }
        
        return max;
    }
}