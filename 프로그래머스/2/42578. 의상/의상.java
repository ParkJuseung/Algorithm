import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> typeCountMap = new HashMap<>();

        // 각 의상 종류별 개수를 센다
        for (String[] cloth : clothes) {
            String type = cloth[1];
            typeCountMap.put(type, typeCountMap.getOrDefault(type, 0) + 1);
        }

        // 조합 계산: (종류별 개수 + 1)을 곱한 후, 아무 것도 안 입은 경우 1을 뺌
        int combinations = 1;
        for (int count : typeCountMap.values()) {
            combinations *= (count + 1);
        }

        return combinations - 1;
    }
}
