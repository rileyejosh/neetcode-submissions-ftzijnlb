class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {

            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String temp = new String(s);
            List<String> entry = new ArrayList<>();
            if (!set.add(strs[i]))
                continue;
            entry.add(strs[i]);

            for (int j = i + 1; j < strs.length; j++) {
                char[] t = strs[j].toCharArray();
                Arrays.sort(t);
                String temp2 = new String(t);
                if (temp.equals(temp2)) {
                    entry.add(strs[j]);
                    set.add(strs[j]);

                }
            }
            res.add(entry);

        }
        return res;
    }
}