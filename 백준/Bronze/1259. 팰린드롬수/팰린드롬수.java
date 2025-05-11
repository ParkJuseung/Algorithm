import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String number = sc.nextLine();
            if (number.equals("0")) {
                break;
            }

            if (isPalindrome(number)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
