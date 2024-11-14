class Solution {
    public int solution(int num) {
        int answer = 0;
        for(int i = 1; i<501; i++){
            if(num==1){
                return answer = i -1;
            }
            else if(num % 2 == 0){
                num = num /2;
            }
            else if(num % 2 != 0 && num > 1){
                num = num * 3 + 1;
            }
            else if(i == 500){
                answer = -1;
            }
        }
        return answer;
    }
}