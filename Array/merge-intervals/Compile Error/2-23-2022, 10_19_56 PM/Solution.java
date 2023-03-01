// https://leetcode.com/problems/merge-intervals

class Solution {
    public int[][] merge(int[][] intervals) {
        
        
        List<int[]> ret = new ArrayList();
        
        int[] curr = intervals[0];
        
        
        for(int[] i : intervals){
            currBeg = curr[0];
            currEnd = curr[1];
            iBeg = i[0];
            iEnd = i[1];
                     
            if(currEnd >= iBeg){
                curr[1] = Math.max(currEnd, iEnd);                
              
            }
            else{
                curr = i;
                ret.add(curr);
                
            }
                     
        }
        
        
        return ret.toArray(new int[ret.size()][]);
        
        
        
        
        
    }
}