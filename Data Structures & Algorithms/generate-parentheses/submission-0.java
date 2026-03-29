class Solution {
    
    List<String> p;

    public List<String> generateParenthesis(int n) {

        StringBuilder s = new StringBuilder();
        p = new ArrayList<>();
        dfs(n, 0, 0, s);
        return p;
    }

    private void dfs(int n, int o, int c, StringBuilder s) {
        
        if(o == c && o == n) {
             p.add(s.toString());
             return;
        }

        if(o < n) {
            s.append("(");
            dfs(n, o+1, c, s);
             s.deleteCharAt(s.length()-1);
        }
        if(c < o) {
            s.append(")");
            dfs(n, o, c+1, s);
             s.deleteCharAt(s.length()-1);
        }
        
       
        
    }
}
