class Solution {
    public int solution(int n) {
        int answer = 0;

        
        
        //1부터 n까지 반복문
        for(int i = 1; i<=n; i++){
            int sum = 0;
            
            for(int startNum = i; startNum<=n; startNum++){
                
                if(sum<n){
                    sum += startNum;
                }else if(sum==n){
                    answer += 1;
                    break;
                }else break;
                
            }
            
        }
        return answer+1;
    }
}