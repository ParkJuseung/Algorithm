import java.util.*;

class Solution {
    // i : 시작점
    // j : 끝점
    // k : 원소 num
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // 배열 자르기(i ~ j) 
        for(int i= 0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        
        return answer;
    }
}