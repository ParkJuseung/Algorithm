import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        ArrayList<Integer> sequence = new ArrayList<>();
        int num = 1;

        // B번째까지 포함되도록 수열 생성
        while (sequence.size() < B) {
            for (int i = 0; i < num; i++) {
                sequence.add(num);
            }
            num++;
        }

        int sum = 0;
        for (int i = A - 1; i < B; i++) {
            sum += sequence.get(i);
        }

        System.out.println(sum);
    }
}
