// https://leetcode.com/problems/sliding-window-maximum

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ret = new ArrayList<>();
        int left = 0;
        int right = k-1;
        for(int i = right; i < nums.length;i++){
            int runsum = Integer.MIN_VALUE;
            for(int j = left; j <= i; j++){
                
                runsum = Math.max(runsum, nums[j]);
                
            }
            ret.add(runsum);
            left++;
        }
        
        int[] arr = new int[ret.size()];
for(int i = 0; i < ret.size(); i++) {
    arr[i] = ret.get(i);
}
        return arr;
    }
}