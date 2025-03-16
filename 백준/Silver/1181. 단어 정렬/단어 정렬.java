import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리
        
        Set<String> set = new HashSet<>(); // 중복 제거를 위한 HashSet 사용
        
        for (int i = 0; i < num; i++) {
            set.add(scanner.nextLine()); // 중복을 자동으로 제거
        }

        // 리스트로 변환
        List<String> list = new ArrayList<>(set);

        // 정렬 (길이순 -> 사전순)
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length(); // 길이순 정렬
                }
                return o1.compareTo(o2); // 사전순 정렬
            }
        });

        // 결과 출력
        for (String word : list) {
            System.out.println(word);
        }

        scanner.close(); // Scanner 닫기
    }
}
