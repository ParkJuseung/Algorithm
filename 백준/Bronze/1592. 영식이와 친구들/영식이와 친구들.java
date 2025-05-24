import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int L = sc.nextInt(); 

        int[] counts = new int[N]; 
        int current = 0;           
        int throwsCount = 0;      

        counts[current] = 1; 

        while (counts[current] < M) {
            if (counts[current] % 2 == 1) {
                // 홀수번 받았으면 시계 방향
                current = (current + L) % N;
            } else {
                // 짝수번 받았으면 반시계 방향
                current = (current - L + N) % N;
            }

            counts[current]++;
            throwsCount++;
        }

        System.out.println(throwsCount);
    }
}
