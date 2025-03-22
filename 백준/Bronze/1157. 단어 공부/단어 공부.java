import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toUpperCase(); // 전부 대문자로

        int[] alphabet = new int[26]; // 알파벳 A~Z 개수 세기 위한 배열

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            alphabet[ch - 'A']++; // 'A'를 0번 인덱스로 계산
        }

        int max = 0;
        char result = '?';
        boolean isDuplicate = false;

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                result = (char) (i + 'A');
                isDuplicate = false;
            } else if (alphabet[i] == max) {
                isDuplicate = true;
            }
        }

        System.out.println(isDuplicate ? '?' : result);
    }
}
