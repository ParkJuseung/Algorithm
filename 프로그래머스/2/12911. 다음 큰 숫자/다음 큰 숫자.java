class Solution {
    public int solution(int n) {
         int oneCount = Integer.bitCount(n); 
        int next = n + 1; 

        while (Integer.bitCount(next) != oneCount) {
            next++; 
        }

        return next;
    }
    
}