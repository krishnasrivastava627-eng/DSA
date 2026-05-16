class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != '#'){
                st.push(ch);
            }else if(!st.isEmpty()){
                st.pop();
            }
        }
        Stack<Character> tt = new Stack<>();
        for(char ch : t.toCharArray()){
            if(ch != '#'){
                tt.push(ch);
            }else if(!tt.isEmpty()){
                tt.pop();
            }
        }
       return st.equals(tt);
    }
}