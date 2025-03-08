import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = sc.next();
            boolean[] visited = new boolean[26]; // 알파벳 등장 여부 확인
            boolean isGroup = true;

            for (int j = 0; j < word.length(); j++) {
                char current = word.charAt(j);

                if (visited[current - 'a']) { // 이미 방문한 문자라면
                    if (word.charAt(j - 1) != current) { // 직전 문자와 다르면 그룹단어 아님
                        isGroup = false;
                        break;
                    }
                } else {
                    visited[current - 'a'] = true; // 첫 등장 문자 방문 처리
                }
            }

            if (isGroup) count++;
        }

        System.out.println(count);
        sc.close();
    }
}
