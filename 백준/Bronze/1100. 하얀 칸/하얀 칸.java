import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 8; i++) {
            String line = sc.nextLine(); // 한 줄 입력
            for (int j = 0; j < 8; j++) {
                // (i + j) % 2 == 0이면 하얀 칸
                if ((i + j) % 2 == 0 && line.charAt(j) == 'F') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
