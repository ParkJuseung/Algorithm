import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            double n = scanner.nextDouble();
            if (n == 0) break;

            double wives = n;
            double sacks = n * wives;
            double cats = n * sacks;
            double kits = n * cats;
            double total = 1 + wives + sacks + cats + kits;

            System.out.printf("%.2f\n", total);
        }

        scanner.close();
    }
}
