import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  

        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = getLastComputer(a, b);
            System.out.println(result);
        }

        sc.close();
    }

    public static int getLastComputer(int a, int b) {

        a = a % 10;

        if (a == 0) return 10;


        int[] pattern;
        switch (a) {
            case 1: pattern = new int[]{1}; break;
            case 2: pattern = new int[]{2, 4, 8, 6}; break;
            case 3: pattern = new int[]{3, 9, 7, 1}; break;
            case 4: pattern = new int[]{4, 6}; break;
            case 5: pattern = new int[]{5}; break;
            case 6: pattern = new int[]{6}; break;
            case 7: pattern = new int[]{7, 9, 3, 1}; break;
            case 8: pattern = new int[]{8, 4, 2, 6}; break;
            case 9: pattern = new int[]{9, 1}; break;
            default: pattern = new int[]{10}; 
        }

        int index = (b - 1) % pattern.length;
        return pattern[index];
    }
}
