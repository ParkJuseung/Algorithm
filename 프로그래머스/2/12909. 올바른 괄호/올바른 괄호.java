import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for(int i =0; i<s.length(); i++){
            if(s.charAt(0) == ')'){
                return answer = false;
            }else if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(stack.peek() == '(' && s.charAt(i) == ')'){
                stack.pop();
            }else stack.push(s.charAt(i));
        }
        
        return answer = stack.isEmpty()? true : false;

    }
}