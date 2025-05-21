import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentPassengers = 0;
        int maxPassengers = 0;

        // 총 10개의 역을 반복
        for (int i = 0; i < 10; i++) {
            int off = sc.nextInt();  // 내린 사람 수
            int on = sc.nextInt();   // 탄 사람 수

            currentPassengers -= off;
            currentPassengers += on;

            // 현재 승객 수가 최대일 경우 갱신
            if (currentPassengers > maxPassengers) {
                maxPassengers = currentPassengers;
            }
        }

        System.out.println(maxPassengers);
        sc.close();
    }
}
