class Solution {
    // 두 정수의 GCD 계산 (유클리드 알고리즘)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 두 정수의 LCM 계산
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 배열의 전체 LCM 계산
    public int solution(int[] arr) {
        int result = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]); 
        }
        return result;
    }
}
