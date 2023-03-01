// https://leetcode.com/problems/merge-intervals

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> merged = new ArrayList();
        Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
        int[] curr = intervals[0];
        merged.add(curr);
        for(int[] interval : intervals){
         
            int currBeg = curr[0];
            int currEnd = curr[1];
            int interBeg = interval[0];
            int interEnd = interval[1];
            
            if(currEnd>=interBeg){
                curr[1] = Math.max(currEnd,interEnd);
            }
            else{
                curr = interval;
                merged.add(curr);
            }
        }
         return merged.toArray(new int[merged.size()][]);
        }
    }
