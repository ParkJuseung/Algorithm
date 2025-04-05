import java.util.*;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> daysQueue = new LinkedList<>();

        // 각 기능의 남은 작업 일수를 계산해서 큐에 추가
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int days = (int) Math.ceil((double) remain / speeds[i]);
            daysQueue.offer(days);
        }

        while (!daysQueue.isEmpty()) {
            int current = daysQueue.poll(); // 첫 번째 기능의 작업일
            int count = 1;

            // 다음 기능이 현재 기능보다 먼저 끝나거나 동시에 끝나는 경우 같이 배포
            while (!daysQueue.isEmpty() && daysQueue.peek() <= current) {
                daysQueue.poll();
                count++;
            }

            result.add(count);
        }

        // 리스트를 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
