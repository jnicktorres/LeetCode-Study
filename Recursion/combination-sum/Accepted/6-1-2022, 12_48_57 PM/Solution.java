// https://leetcode.com/problems/combination-sum

class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ls = new ArrayList();
        Arrays.sort(candidates);
         backtrack(ls, new ArrayList<>(), candidates, target, 0);
        return ls;
    }
    
    private void backtrack(List<List<Integer>> ls, List<Integer> temp, int[] nums, int target,int start){
        if(target<0){
            return;
        }
        else if(target == 0) ls.add(new ArrayList<>(temp));
        else{
            for(int i = start; i < nums.length;i++){
                temp.add(nums[i]);
                backtrack(ls, temp, nums, target - nums[i], i); // not i + 1 because we can reuse same elements
                temp.remove(temp.size() - 1);
            }
        }
        
        
    }
}