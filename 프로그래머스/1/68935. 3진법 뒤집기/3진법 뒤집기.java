class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n,3);
        
        StringBuffer sb = new StringBuffer(s);
        s = sb.reverse().toString();
        
        answer = Integer.parseInt(s,3);
        
        return answer;
    }
}