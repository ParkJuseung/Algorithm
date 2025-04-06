import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 원래 숫자
        int F = sc.nextInt(); // 나눌 수

        int front = N / 100 * 100; // 마지막 두 자리를 00으로 만든 수

        int result = 0;
        for (int i = 0; i < 100; i++) {
            if ((front + i) % F == 0) {
                result = i;
                break;
            }
        }

        // 결과가 한 자리일 경우 앞에 0을 붙여서 출력
        System.out.printf("%02d\n", result);
    }
}
