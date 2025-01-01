class Solution {
    public int solution(int a, int b, int n) {
        //마트에 주는 병의 수 a
        //빈 병 a를 가져다 주면 마트가 주는 콜라의 수 b
        //내가 가진 빈 병의 수 n
        //받을 수 있는 콜라의 병 수 return
        
        int answer = 0;
        int emptyBottle = 0; 
        
        while(n>=a){
            answer += ((n/a) * b);
            n = ((n/a) * b) + n%a;
        }
        
        return answer;
    }
}