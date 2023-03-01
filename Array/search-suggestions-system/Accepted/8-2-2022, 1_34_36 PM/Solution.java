// https://leetcode.com/problems/search-suggestions-system

class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        int max = 3;
        List<List<String>> ret = new ArrayList();
        Arrays.sort(products);
        List<String> arr = new ArrayList();
           for(String s : products){
               char cur = searchWord.charAt(0);
               if(cur == s.charAt(0)){     
                   arr.add(s);          
               }                         
           }
           
           ret.add(arr);
        
        if(arr!= null)
           for(int i=1; i<searchWord.length(); i++) {          
              char cur = searchWord.charAt(i);
               
              List<String> some = new ArrayList();
               for(String res : arr){                   
                   if(i < res.length() && cur == res.charAt(i)){
                       some.add(res);
                   }
               }               
               ret.add(some);
               arr = some;           
       }
               
        List<List<String>> returne = new ArrayList();
        
        for(List<String> ls : ret){
            List<String> toadd = new ArrayList();
            for(int i = 0; i < ls.size();i++){
                if(i < max){
                 toadd.add(ls.get(i));
                }
            }
            returne.add(toadd);
        }
        
        return returne;        
    }
}