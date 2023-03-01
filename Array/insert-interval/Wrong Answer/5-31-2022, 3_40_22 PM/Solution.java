// https://leetcode.com/problems/insert-interval

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> merged = new ArrayList();
        
        for(int i = 0; i < intervals.length;i++){
            if(newInterval[1] < intervals[i][0]){
                merged.add(newInterval);
                for(int j = i; j < intervals.length;j++){
                    merged.add(intervals[i]);
                }
                return merged.toArray(new int[merged.size()][2]);
            }
            else if(newInterval[0] > intervals[i][1]){
                merged.add(intervals[i]);
            }
            else{
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
                
            }
            
        }
        
        merged.add(newInterval);
        
        return merged.toArray(new int[merged.size()][2]);
        
        
        
    }
}