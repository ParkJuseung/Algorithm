import java.util.Scanner;

public class Main {
    public static int calculateWidth(String number) {
        int totalWidth = 0;

        for (char c : number.toCharArray()) {
            switch (c) {
                case '1':
                    totalWidth += 2;
                    break;
                case '0':
                    totalWidth += 4;
                    break;
                default:
                    totalWidth += 3;
            }
        }

        // 숫자 사이 여백: (숫자 개수 - 1) * 1
        totalWidth += number.length() - 1;

        // 양쪽 경계 여백 2cm (1cm씩 양쪽)
        totalWidth += 2;

        return totalWidth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine().trim();

            if (input.equals("0")) {
                break;
            }

            int result = calculateWidth(input);
            System.out.println(result);
        }

        sc.close();
    }
}
