class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            // 대문자 처리
            if(c>= 'A' && c <= 'Z'){
                answer += (char)((c-'A'+n)%26 + 'A');
            }
            
            // 소문자 처리
            else if(c>= 'a' && c <= 'z'){
                answer += (char)((c-'a'+n)%26 + 'a');
            }
            else answer += s.charAt(i);
        }
        return answer;
    }
}