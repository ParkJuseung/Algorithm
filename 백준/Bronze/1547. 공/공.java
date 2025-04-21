import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(); // 컵을 바꾸는 횟수
        int ballPosition = 1; // 공은 처음에 1번 컵에 있음

        for (int i = 0; i < M; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            // 공이 X번 컵에 있으면 Y로 이동
            if (ballPosition == X) {
                ballPosition = Y;
            }
            // 공이 Y번 컵에 있으면 X로 이동
            else if (ballPosition == Y) {
                ballPosition = X;
            }
            // 공이 다른 컵에 있으면 위치 변화 없음
        }

        System.out.println(ballPosition);
    }
}
