import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // L: 1m^2당 사람 수, P: 파티 장소 넓이
        int L = sc.nextInt();
        int P = sc.nextInt();

        // 실제 참가자 수
        int actual = L * P;

        // 신문에 실린 5개의 참가자 수 읽기
        for (int i = 0; i < 5; i++) {
            int reported = sc.nextInt();
            System.out.print((reported - actual) + " ");
        }

        sc.close();
    }
}
