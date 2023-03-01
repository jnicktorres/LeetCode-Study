// https://leetcode.com/problems/merge-intervals

class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
        
        List<int[]> list = new ArrayList();
        int[] curr = intervals[0];
        list.add(curr);
        
        for(int[] interval : intervals){
            
            int currBeg = curr[0];
            int currEnd = curr[1];
            int interBeg = interval[0];
            int interEnd = interval[1];
            
            if(currEnd >= interBeg){
                curr[1] = Math.max(currEnd,interEnd);
            }
            else{
            curr = interval;
            list.add(curr);
            }
            
         }
        
        return list.toArray(new int[list.size()][]);
        
        
    }
}