class TimeMap {

    Map<String, List<String[]>> store;

    public TimeMap() {
        store = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        String[] entry = new String[] { value, String.valueOf(timestamp) };

        if (!store.containsKey(key)) {

            store.put(key, new ArrayList<>());
            store.get(key).add(entry);
            System.out.print(entry[0] + " " + entry[1]);
            

        } else {
            store.get(key).add(entry);
            System.out.print(entry[0] + " " + entry[1]);
            
        }
    }

    public String get(String key, int timestamp) {
        String val = "";
        if (!store.containsKey(key))
            return val;
   
        List<String[]> entries = store.get(key);
        for (int i = 0; i < entries.size(); i++) {
            String[] entry = entries.get(i);
            if (Integer.parseInt(entry[1]) == timestamp)
                return entry[0];
            
            if(Integer.parseInt(entry[1]) < timestamp) { 

                val = entry[0];
            }

        }
        return val;
    }
}
