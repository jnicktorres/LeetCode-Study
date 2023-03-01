// https://leetcode.com/problems/merge-intervals

class Solution {
    public int[][] merge(int[][] intervals) {
     
     ArrayList<int[]> merged = new ArrayList();
     Arrays.sort(intervals,(a,b) ->                 Integer.compare(a[0],b[0]));
     int[] cur = intervals[0];
     int[] newInt = new int[2];
     
        for(int i = 1; i < intervals.length;i++){
            if(cur[1] >= intervals[i][0]){
               cur[1] = Math.max(cur[1], intervals[i][1]);
            }   
            else{
                merged.add(cur);
                cur = intervals[i];
            }
        }
       merged.add(cur);
        
        return merged.toArray(new int[merged.size()][2]);
    }
}