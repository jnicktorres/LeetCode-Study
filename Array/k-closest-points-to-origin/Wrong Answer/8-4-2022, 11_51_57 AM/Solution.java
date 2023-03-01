// https://leetcode.com/problems/k-closest-points-to-origin

class Solution {
    public int[][] kClosest(int[][] points, int k) {
       
       TreeMap<Integer,int[]> map = new TreeMap<Integer,int[]>();
        
        for(int i =0; i < points.length;i++){
            int sum = (points[i][0]*points[i][0] + points[i][1] *points[i][1]);
            map.put(sum,points[i]);
        }
        
        int[][] ret = new int[k][2];
        
        int i = 0;
        
        for(int[] value : map.values()){
            if(i<k){
                ret[i] = value;
                i++;
            }
        }
        return ret;
            
            
        }
    }
