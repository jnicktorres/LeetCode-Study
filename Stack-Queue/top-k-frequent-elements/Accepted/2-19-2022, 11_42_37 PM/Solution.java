// https://leetcode.com/problems/top-k-frequent-elements

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] output = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        // puts every value in nums into our hashmap and records frequency
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        //sorts it into a priority queue from greatest priority to least greatest.
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        
        //for every entry in our map, we push it into our queue
        for(Map.Entry e : map.entrySet()){
            pq.add(e);
        }
        
        // iterate k times and get key from priority queue.
        for(int i = 0; i < k;i++){
           output[i] = pq.poll().getKey();
            
        }
        return output;
    }
}