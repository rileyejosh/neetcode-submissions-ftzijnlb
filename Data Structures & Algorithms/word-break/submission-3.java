class Solution {
    Map<Integer, Boolean> cache;
    public boolean wordBreak(String s, List<String> wordDict) {
        cache = new HashMap<>();
        return wordBreak(s, wordDict, 0);
    }

    private boolean wordBreak(String s, List<String> wordDict, int i) {

        if(i == s.length()) return true;

        if(cache.containsKey(i))
            return cache.get(i);

        for(String word : wordDict) {

            if(i + word.length() <= s.length()
               && s.substring(i, i+word.length()).equals(word) )
                if(wordBreak(s, wordDict, i+word.length())) {
                    cache.put(i+word.length(), true);
                    return true;
                }
                else
                    cache.put(i+word.length(), false);
                    
        }

        return false;

    }
}
