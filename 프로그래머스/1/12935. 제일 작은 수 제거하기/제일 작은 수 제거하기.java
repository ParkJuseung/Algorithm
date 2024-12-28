import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 배열에서 가장 작은 수 제거 
        // 빈 배열이면 -1 리턴 
        
        //배열의 최소값 확인
        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);
        int min = sortArr[0];
        
        
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length>1){
            for(int i = 0; i<arr.length; i++){
                if(arr[i] != min){
                    list.add(arr[i]);
                }
            }
        }else list.add(-1);
        
        
        int[] answer = new int[list.size()];
        int index = 0;
        for(int i : list){
            answer[index] = i;
            index++;
        }
     
        return answer;
    }
}