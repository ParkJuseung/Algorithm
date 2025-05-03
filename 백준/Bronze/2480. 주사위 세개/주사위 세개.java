import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 세 개의 눈 입력
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int reward;

        // 모두 같은 경우
        if (a == b && b == c) {
            reward = 10000 + a * 1000;
        }
        // 두 개만 같은 경우
        else if (a == b || a == c) {
            reward = 1000 + a * 100;
        }
        else if (b == c) {
            reward = 1000 + b * 100;
        }
        // 모두 다른 경우
        else {
            int max = Math.max(a, Math.max(b, c));
            reward = max * 100;
        }

        System.out.println(reward);
    }
}
