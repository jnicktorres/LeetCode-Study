// https://leetcode.com/problems/merge-intervals

class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b) -> Compare(a[0],b[0]));
        List<int[]> ret = new ArrayList();
        
        int[] curr = intervals[0];
        ret.add(curr);
        
        for(int i : intervals){
            int currBeg = curr[0];
            int currEnd = curr[1];
            int iBeg = i[0];
            int iEnd = i[1];
            
            if(currBeg >= iBeg){
                
                currEnd = Math.max(currEnd,iEnd);
            }
            else{
                curr = i;
                ret.add(curr);
                
            }
            
            
        }
        
        return ret.asArray(new int[ret.size()][]);
        
        
    }
}