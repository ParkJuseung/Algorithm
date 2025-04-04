public class Solution {
    public String solution(int a, int b) {
        // 요일 배열: 일요일부터 토요일까지
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        // 각 월의 일수 배열 (윤년 기준, 2016년은 윤년)
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 1월 1일부터 (a월 b일)까지 며칠이 지났는지 계산
        int totalDays = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDays += monthDays[i];
        }
        totalDays += (b - 1);

        // 요일 계산
        return days[totalDays % 7];
    }

    // 예시 실행
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5, 24)); // TUE 출력
    }
}
