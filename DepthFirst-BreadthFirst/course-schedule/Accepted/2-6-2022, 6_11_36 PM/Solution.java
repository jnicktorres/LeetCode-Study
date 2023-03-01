// https://leetcode.com/problems/course-schedule

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        if(numCourses == 0 || prerequisites.length ==0) return true;
        
        int[] indegree = new int[numCourses];
        
        for(int i = 0; i < prerequisites.length;i++){
            
            indegree[prerequisites[i][0]]++; 
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0; i < numCourses;i++){
            if (indegree[i] == 0)
            q.add(i);
            
        }
        
        int courtoFin = q.size();
        
        while(!q.isEmpty()){
            int pre = q.remove();
            for(int i = 0; i < prerequisites.length;i++){
                if (prerequisites[i][1] == pre) { 
                indegree[prerequisites[i][0]]--;
                if (indegree[prerequisites[i][0]] == 0) {
                    courtoFin++;
                    q.add(prerequisites[i][0]);
                }
            } 
                
            }
            
            
            
        }
        return (courtoFin == numCourses);
    }
}