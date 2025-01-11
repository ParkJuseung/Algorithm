import java.util.*;
import java.lang.*;

class Solution
{
    public int solution(int []A, int[] B)
    {
        int answer = 0;
        Arrays.sort(A);
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : B){
            list.add(i);
        }
        
        Collections.sort(list, (o1, o2) -> o2 - o1);
        
        for (int i=0; i<A.length; i++){
            answer += A[i] * list.get(i);
        }
        
        return answer;
    }
}