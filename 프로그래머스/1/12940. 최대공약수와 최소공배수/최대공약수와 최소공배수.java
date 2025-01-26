class Solution {
    // 최대 공약수(GCD) 계산 함수
    public static int gcd(int n, int m) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
    
    // 최소 공배수(LCM) 계산 함수
    public static int lcm(int n, int m) {
        return (n * m) / gcd(n, m); 
    }
    
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n,m), lcm(n,m)};
        return answer;
    }
}