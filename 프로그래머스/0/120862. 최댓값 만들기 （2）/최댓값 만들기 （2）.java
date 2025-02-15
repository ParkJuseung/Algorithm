import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int result = 0;
        int minusX = numbers[0] * numbers[1];
        int plusX = (numbers[numbers.length-2]) * (numbers[numbers.length - 1]);

        
        return result = minusX>plusX? minusX : plusX;
        
        
    }
}