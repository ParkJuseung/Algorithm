import java.util.*;

class Solution
{
    public int solution(String s)
    {
        //stack 생성
        Stack<Character> stack = new Stack<>();
        
        //stack 채우기
        for(int i =0; i<s.length(); i++){
            if(stack.size()== 0 || stack.peek() != s.charAt(i)){
               stack.push(s.charAt(i)); 
            }else stack.pop();
        }

        return stack.isEmpty()? 1 : 0;
    }
}