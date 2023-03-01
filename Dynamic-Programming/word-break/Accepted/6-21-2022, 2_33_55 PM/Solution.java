// https://leetcode.com/problems/word-break

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[n] = true;
        Set<String> set = new HashSet(wordDict);
        
        for(int i = n-1; i >= 0; i--){
            for(int j = i + 1; !dp[i] && j <= n;j++){
                dp[i] = dp[j] & set.contains(s.substring(i,j));
            }
        }
        
        return dp[0];
    }
}