public class Solution{
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int n = arr1.length;          // arr1의 행 수
        int m = arr2[0].length;       // arr2의 열 수
        int k = arr1[0].length;       // arr1의 열 수 == arr2의 행 수

        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {         // arr1의 행
            for (int j = 0; j < m; j++) {     // arr2의 열
                for (int l = 0; l < k; l++) { // 곱셈 대상
                    result[i][j] += arr1[i][l] * arr2[l][j];
                }
            }
        }

        return result;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        int[][] arr1 = {
            {1, 4},
            {3, 2},
            {4, 1}
        };
        int[][] arr2 = {
            {3, 3},
            {3, 3}
        };

        int[][] result = solution(arr1, arr2);

        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
