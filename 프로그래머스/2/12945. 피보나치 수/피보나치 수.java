import java.util.*;

class Solution {
    public int solution(int n) {
        
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(0);
        list.add(1);
            
        for(int i =2; i<=n; i++){
                list.add((list.get(i-1) + list.get(i-2))%1234567);
        }

        answer = list.get(n)%1234567;
        
        return answer;
    }
}