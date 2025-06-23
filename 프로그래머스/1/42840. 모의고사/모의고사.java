import java.util.*;

public class Solution {
    public int[] solution(int[] answers) {
        // 각 수포자의 찍기 패턴
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3]; // 수포자 1, 2, 3의 정답 수를 저장

        // 채점
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) scores[0]++;
            if (answers[i] == pattern2[i % pattern2.length]) scores[1]++;
            if (answers[i] == pattern3[i % pattern3.length]) scores[2]++;
        }

        // 최고 점수 계산
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 최고 점수를 받은 사람(들)을 리스트에 추가
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                result.add(i + 1); // 수포자 번호는 1부터 시작
            }
        }

        // 결과를 배열로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
