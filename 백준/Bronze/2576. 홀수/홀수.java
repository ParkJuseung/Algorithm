import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int minOdd = Integer.MAX_VALUE; 

        for (int i = 0; i < 7; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 1) { 
                sum += num;
                if (num < minOdd) {
                    minOdd = num;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minOdd);
        }

        scanner.close();
    }
}
