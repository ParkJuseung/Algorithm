import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 문자열을 문자 배열로 변환
        char[] chars = s.toCharArray();
        
        // 문자 배열을 정렬 (오름차순)
        Arrays.sort(chars);
        
        // 정렬된 배열을 문자열로 변환하고 내림차순으로 뒤집음
        StringBuilder sb = new StringBuilder(new String(chars));
        return sb.reverse().toString();
    }
}
