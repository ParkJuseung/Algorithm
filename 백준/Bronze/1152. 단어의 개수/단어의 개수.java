import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = input.trim().split(" ");
            System.out.println(words.length);
        }

        scanner.close();
    }
}
