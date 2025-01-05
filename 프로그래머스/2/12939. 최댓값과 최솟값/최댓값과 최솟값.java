import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String s) {

        String num[] = s.split(" ");
        int min = Integer.parseInt(num[0]);
        int max = Integer.parseInt(num[0]); 
        
        for(String str : num){
            int number = Integer.parseInt(str);
            if(number>max){
                max = number;
            }
            if(number<min){
                min = number;
            }
        }
        
        return min + " " + max;

    }
}