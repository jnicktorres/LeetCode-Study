// https://leetcode.com/problems/merge-intervals

class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> merged = new ArrayList();
        
        int[] cur = intervals[0];
        merged.add(cur);
        for(int[] i : intervals){
            int currb = cur[0];
            int curre = cur[1];
            int ib = i[0];
            int ie = i[1];
            
            if(curre>= ib){
                cur[1] = Math.max(curre,ie);
            }
            else{
                curr = i;
                merge.add(cur);
            }
            
        }
        
        return merged.toArray(new int[merged.size()][2]);
    }
}