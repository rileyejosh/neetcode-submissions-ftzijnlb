class TimeMap {

    Map<String, List<String[]>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    // O(1)
    public void set(String key, String value, int timestamp) {
        String[] entry = {value, ""+timestamp};
        
        List<String[]> entries = map.get(key);
        if(entries != null) map.get(key).add(entry); 
        else { 
            map.put(key, new ArrayList<>());
            map.get(key).add(entry);
        }
    }
    
    //O(logn)
    public String get(String key, int timestamp) {
        
        List<String[]> entries = map.get(key);
        
        if(map.get(key) == null || Integer.parseInt(entries.get(0)[1]) > timestamp) return "";
        int l = 0;
        int r = entries.size()-1;
        while(l <= r) {
            int m = (l+r)/2;
            int cur_timestamp = Integer.parseInt(entries.get(m)[1]);
            if(cur_timestamp == timestamp) return entries.get(m)[0];
            else if(timestamp > cur_timestamp )
                l = m + 1;
            else r = m-1;
        }
        for(String[] entry : entries) {
            
            if(entry[1].equals(""+timestamp))  return entry[0];
        }
        String prev_timestamp = "";
        for(String[] entry : entries) {
            if(Integer.parseInt(entry[1]) < timestamp)
                prev_timestamp = entry[0];
            
        }
        return prev_timestamp;
    }
}
