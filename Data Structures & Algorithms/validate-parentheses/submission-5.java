class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] paren = s.toCharArray();
        if(paren.length % 2 != 0)
            return false;
        for(int i = 0; i < paren.length; i++) {
            if(paren[i] == ')') {
                if(st.isEmpty())
                    return false;
                char c = st.pop();
                if(c != '(')
                    return false;
            }
            else if(paren[i] == '}') {
                if(st.isEmpty())
                    return false;
                char c = st.pop();
                if(c != '{')
                    return false;
            }
            else if(paren[i] == ']') {
                if(st.isEmpty())
                    return false;
                char c = st.pop();
                if(c != '[')
                    return false;
            }
            else {
                st.push(paren[i]);
            }
        }
        if(!st.isEmpty())
            return false;
        return true;
     }
}
