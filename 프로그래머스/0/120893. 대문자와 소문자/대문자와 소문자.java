import java.lang.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i) >='a' && my_string.charAt(i) <='z'){
                sb.append((char)(my_string.charAt(i)-32));
            }else if(my_string.charAt(i) >='A' && my_string.charAt(i) <='Z'){
               sb.append((char)(my_string.charAt(i)+32));
            }
        }
        
        return sb.toString();
    }
}