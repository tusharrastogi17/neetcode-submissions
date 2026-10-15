class Solution {
    public boolean isValid(String s) {

        Stack<Character> ch = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            
            if(c=='('){
                ch.push(')');
            }else if(c=='['){
                ch.push(']');
            }else if(c=='{'){
                ch.push('}');
            }
            else{
                if(ch.isEmpty() || ch.pop()!=c){
                    return false;
                }
            }
        }

        return ch.isEmpty();
        
    }
}
