import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        int maxNum1 = 0;
        int maxNum2 = 0;
        
        for(int i = 0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
        }
        
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][0] > maxNum1){
                maxNum1 = sizes[i][0];
            }
            
            if(sizes[i][1] > maxNum2){
                maxNum2 = sizes[i][1];
            }
        }
        
        return maxNum1 * maxNum2;
    }
}