import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        String line = sc.nextLine();

        int[] counts = new int[26];

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
            }
        }

        int max = 0;
        for (int count : counts) {
            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);
    }
}
