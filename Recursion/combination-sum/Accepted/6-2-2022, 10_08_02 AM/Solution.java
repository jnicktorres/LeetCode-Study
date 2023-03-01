// https://leetcode.com/problems/combination-sum

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ls = new ArrayList();
        List<Integer> temp = new ArrayList();
        Arrays.sort(candidates);
        backtrack(ls,temp,target,candidates,0);
        return ls;
        
        
    }
    private void backtrack( List<List<Integer>> ls,List<Integer> temp, int remain,int[] candidates,int start){
        if(remain < 0){
            return;
        }
        else if(remain == 0){
            ls.add(new ArrayList<>(temp));
            }
        else{
            for(int i = start; i < candidates.length;i++){
                temp.add(candidates[i]);
                backtrack(ls,temp,remain-candidates[i],candidates,i);
                temp.remove(temp.size()-1);
                
                
            }
            
            
        }
        
        
    }
}