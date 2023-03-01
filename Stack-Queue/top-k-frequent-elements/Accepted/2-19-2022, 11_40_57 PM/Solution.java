// https://leetcode.com/problems/top-k-frequent-elements

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] output = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        
        for(Map.Entry e : map.entrySet()){
            pq.add(e);
        }
        
        for(int i = 0; i < k;i++){
           output[i] = pq.poll().getKey();
            
        }
        return output;
    }
}