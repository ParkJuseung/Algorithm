import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answerList= new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                answerList.add(arr[i]);
            }
        }
        
        if(answerList.isEmpty()){
            return new int[] {-1};
        }
        Collections.sort(answerList);
        int[] answer = new int[answerList.size()];
        for(int i = 0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        return answer;
        
    }
}