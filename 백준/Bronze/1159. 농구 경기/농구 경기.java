import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        sc.nextLine();         

        Map<Character, Integer> map = new HashMap<>();

        // 선수들의 성 입력
        for (int i = 0; i < n; i++) {
            String surname = sc.nextLine();
            char firstChar = surname.charAt(0); 

            map.put(firstChar, map.getOrDefault(firstChar, 0) + 1);
        }

        List<Character> result = new ArrayList<>();

        // 5명 이상 모인 첫 글자 찾기
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 5) {
                result.add(entry.getKey());
            }
        }

        if (result.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            Collections.sort(result); 
            for (char c : result) {
                System.out.print(c);
            }
        }
    }
}
