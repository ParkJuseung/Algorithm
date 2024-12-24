import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        char[] arr = String.valueOf(n).toCharArray();
        
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            answer = arr[i] + answer;
        }
        long result = Long.parseLong(answer);
        return result;
    }
}