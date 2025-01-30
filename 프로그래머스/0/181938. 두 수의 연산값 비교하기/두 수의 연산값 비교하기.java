class Solution {
    public int solution(int a, int b) {
        String stringA = a + "";
        String stringB = b + "";
        
        if(2*a*b > Integer.parseInt(stringA+stringB)){
            return 2* a* b;
        } else {
            return Integer.parseInt(stringA+stringB);
        }
    }
}