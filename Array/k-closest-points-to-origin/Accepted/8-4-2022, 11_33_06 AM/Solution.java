// https://leetcode.com/problems/k-closest-points-to-origin

class Solution {
    public int[][] kClosest(int[][] points, int k) {
       
        PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return (a[0]*a[0] + a[1] *a[1]) - (b[0] * b[0] + b[1]*b[1]);
            }
            
        });
        
        for(int i =0; i < points.length;i++){
            q.add(points[i]);
        }
        
        int[][] ret = new int[k][2];
        
        for(int i = 0; i < k; i++){
            ret[i] = q.poll();
        }
        return ret;
            
            
        }
    }
