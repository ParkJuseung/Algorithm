import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // Max-Heap

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[] { i, priorities[i] }); 
            priorityQueue.offer(priorities[i]);
        }

        int count = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            // 현재 큐에서 가장 높은 우선순위와 비교
            if (current[1] == priorityQueue.peek()) {
                priorityQueue.poll(); 
                count++;

                if (current[0] == location) {
                    return count;
                }
            } else {
                queue.offer(current); // 우선순위 더 높은 게 있으니 뒤로 보냄
            }
        }

        return -1; // 이론적으로 도달하지 않음
    }
}
