class Solution {

    Map<Integer, String> map = new HashMap<>();
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(String s : strs) {
            sb.append(s);
            map.put(count, s);
            count++;
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int start = 0;
        int count = 1;
        int len = 0;
        for(; count <= map.size(); count++) {
            len += map.get(count).length();
            String subStr = str.substring(start, len);
            start = len;
            strs.add(subStr);
        }


        return strs;
    }
}
