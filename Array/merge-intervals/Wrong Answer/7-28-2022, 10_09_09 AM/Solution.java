// https://leetcode.com/problems/merge-intervals

class Solution {
    public int[][] merge(int[][] intervals) {
     
     ArrayList<int[]> merged = new ArrayList();
     Arrays.sort(intervals,(a,b) ->                 Integer.compare(a[0],b[0]));
     int[] cur = intervals[0];
     //merged.add(cur);
     
        for(int[] interval : intervals){
            if(cur[1] >= interval[0]){
                cur[1] = Math.max(interval[1], cur[1]);
            }
            else{
                cur = interval;
                merged.add(cur);
            }
        }
        
        
        return merged.toArray(new int[merged.size()][2]);
        
        
    }
}