class Solution {
    public int solution(int[] number) {
        int answer = 0;
        // 3개의 수의 조합을 모두 확인 할 수 있는 방법 
        for(int i = 0 ; i<number.length-2; i++){
            for(int j = i+1; j< number.length-1; j++){
                for(int k = j+1; k < number.length; k++){
                    if(number[i] + number[j] + number[k] == 0){
                        answer++;
                    };
                }
            }
        }
        return answer;
    }
}