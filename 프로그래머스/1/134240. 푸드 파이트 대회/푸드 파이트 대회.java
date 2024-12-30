import java.lang.StringBuilder;

class Solution {
    public String solution(int[] food) {

        //1번째 배열부터 2로 나눈 몫을 앞 뒤로 n을 n만큼 추가
        //배열이 끝나면 가운데는 0을 추가 
        
        String answer = "";
        
        for(int i=1; i<food.length; i++){
            String count = Integer.toString(food[i]/2);
            for(int j = 0; j<Integer.parseInt(count); j++){
                answer += i;
            }
        }
        StringBuilder sb = new StringBuilder(answer);
        answer += "0" + sb.reverse();
        
        return answer;
    }
}