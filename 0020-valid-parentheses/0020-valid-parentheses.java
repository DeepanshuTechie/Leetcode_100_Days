class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int l = s.length();
        for(int i = 0;i<l;i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '(' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
            char topch = st.peek();
            if((ch == '}' && topch == '{') ||(ch == ')' && topch == '(') ||(ch == ']' && topch == '[')){
                st.pop();
            }
            else{
                return false;
            }
            }
        }
        return st.isEmpty();
    }
}