import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 귤 개수를 저장하는 HashMap 생성 (key: 귤 크기, value: 해당 크기의 개수)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        
        // 귤 개수(Value) 기준 내림차순 정렬
        List<Integer> counts = new ArrayList<>(map.values());
        counts.sort(Collections.reverseOrder()); // 내림차순 정렬

        
        // 가장 많이 등장하는 귤부터 k개 채우기
        int sum = 0; // 선택한 귤 개수
        int count = 0; // 선택한 귤 종류 수
        
        
        for (int num : counts) {
            sum += num;
            count++;
            if (sum >= k) break; // k개 이상 선택되면 종료
        }

        return count; // 최소한의 종류 수 반환
    }
}
