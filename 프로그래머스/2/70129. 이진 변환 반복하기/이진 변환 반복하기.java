import java.lang.StringBuilder;

class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        
        int count = 0;
        int countZero = 0;
        
        // 1. s에서 0 제거
        // 2. s를 int로 변환해서 이진 변환
        // 3. 이진변환 결과가 1이 아니면 1번 부터 반복
        
        while(!s.equals("1")){
            
            count++;
            
            int originalLength = s.length();
            
            s = s.replaceAll("0", ""); // 0 제거
            
            int removedZeros = originalLength - s.length();
            
            countZero += removedZeros;
            
            s = Integer.toBinaryString(s.length());
        }
        answer[0] = count;
        answer[1] = countZero;
        return answer;
    }
}