// https://leetcode.com/problems/merge-intervals

class Solution {
    public int[][] merge(int[][] intervals) {
        
        
        List<int[]> ret = new ArrayList();
        
        
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int[] curr = intervals[0];
        ret.add(curr);
        for(int[] i : intervals){
            int currBeg = curr[0];
            int currEnd = curr[1];
            int iBeg = i[0];
            int iEnd = i[1];
                     
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