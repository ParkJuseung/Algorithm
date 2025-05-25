import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();

            // "#" 입력되면 종료
            if (line.equals("#")) break;

            // 첫 글자는 검색할 문자, 그 다음은 문장
            char target = line.charAt(0);
            String sentence = line.substring(2);

            // 대소문자 구분 없이 세기 위해 모두 소문자로 변환
            target = Character.toLowerCase(target);
            sentence = sentence.toLowerCase();

            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == target) {
                    count++;
                }
            }

            System.out.println(target + " " + count);
        }

        sc.close();
    }
}
