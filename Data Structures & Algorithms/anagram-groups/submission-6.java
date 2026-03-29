class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList();
        HashMap<Character, Integer> map = new HashMap<>();
        for(String str1 : strs) {
            populateMap(map, str1);
            List<String> subList = new ArrayList<>();
                for(String str2 : strs) {     
                    for(int i = 0; i < str2.length(); i++) {
                            char c = str2.charAt(i);
                            if(map.containsKey(c)) {
                                map.put(c, map.get(c)-1);
                                if(map.get(c) <= 0)
                                    map.remove(c);
                            } else 
                                map.put(' ', 0);
                      
                    }
                    if( map.isEmpty()) {
                        subList.add(str2);
                    } 
                    populateMap(map, str1);    
                }
                if(!list.contains(subList))
                    list.add(subList);
            
    
              
        }
        return list;
    }

    private void populateMap(HashMap<Character, Integer> map, String str) {
        map.clear();
        for(int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }
    }

    
}
