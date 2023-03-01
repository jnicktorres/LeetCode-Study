// https://leetcode.com/problems/top-k-frequent-elements

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ret = new int[k];
        HashMap<Integer,Integer> map  = new HashMap<>();
        
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0) + 1);
        }
        
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        
        for(Map.Entry entry : map.entrySet()){
            pq.add(entry);
        }
        
        for(int  i = 0;  i < k;i++){
            ret[i] = pq.poll().getKey();
            
        }
        return ret;
        
    }
}