import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 색상과 해당 값 및 곱셈 값을 저장할 Map
        Map<String, Integer> valueMap = new HashMap<>();
        Map<String, Long> multiplierMap = new HashMap<>();

        // 값 설정
        valueMap.put("black", 0);
        valueMap.put("brown", 1);
        valueMap.put("red", 2);
        valueMap.put("orange", 3);
        valueMap.put("yellow", 4);
        valueMap.put("green", 5);
        valueMap.put("blue", 6);
        valueMap.put("violet", 7);
        valueMap.put("grey", 8);
        valueMap.put("white", 9);

        multiplierMap.put("black", 1L);
        multiplierMap.put("brown", 10L);
        multiplierMap.put("red", 100L);
        multiplierMap.put("orange", 1_000L);
        multiplierMap.put("yellow", 10_000L);
        multiplierMap.put("green", 100_000L);
        multiplierMap.put("blue", 1_000_000L);
        multiplierMap.put("violet", 10_000_000L);
        multiplierMap.put("grey", 100_000_000L);
        multiplierMap.put("white", 1_000_000_000L);

        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        String color1 = scanner.nextLine().trim().toLowerCase();
        String color2 = scanner.nextLine().trim().toLowerCase();
        String color3 = scanner.nextLine().trim().toLowerCase();

        // 값 계산
        int digit1 = valueMap.get(color1);
        int digit2 = valueMap.get(color2);
        long multiplier = multiplierMap.get(color3);

        long resistance = (digit1 * 10L + digit2) * multiplier;
        System.out.println(resistance);

        scanner.close();
    }
}
