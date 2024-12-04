class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1]; // 필요한 크기의 배열 생성
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[num1 + i]; // 원하는 범위의 값을 복사
        }
        return answer;
    }
}
