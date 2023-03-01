// https://leetcode.com/problems/merge-intervals

class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0){
            return new int[][]{};
        }
        
        List<int[]> list = new ArrayList();
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        
        int[] curr  = intervals[0];
        list.add(curr);
        
        for(int[] i : intervals){
            int currBegin = curr[0];
            int currEnd = curr[1];
            int iBegin = i[0];
            int iEnd = i[1];
            
            if(currEnd >= iBegin){
                curr[1] = Math.max(currEnd, iEnd);
            }
            else{
                curr = i;
                list.add(curr);
            }
            
        }
        
        return list.toArray(new int[list.size()][]);
        
        
    }
}