import java.util.*;

class Solution {
    //끝말잇기
    // 이전에 등장했던 단어 사용 금지
    // 한글자 금지
    // 가장 먼저 탈락하는 사람의 번호와 그 사람이 몇번째 차례 에 탈락하는지 
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        // int iterator = -1;
        
        ArrayList<String> list = new ArrayList<>();
        
        for(String s : words){
            if(list.isEmpty()){
                list.add(s);
            }else if(list.get(list.size() - 1).charAt(list.get(list.size() - 1).length() - 1) != s.charAt(0) || 
                        list.contains(s) ||
                        s.length() == 1){
                answer[0] = (list.size() % n ) + 1;
                answer[1] = (list.size() / n ) + 1;
                break;
            }else list.add(s);
        }
        

        return answer;
    }
}