import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int D = scanner.nextInt(); // 대각선 길이
        int H = scanner.nextInt(); // 높이 비율
        int W = scanner.nextInt(); // 너비 비율
        
       
        double ratio = Math.sqrt(H * H + W * W);
        double x = D / ratio;
        
        int realHeight = (int)(x * H);
        int realWidth = (int)(x * W);
        
        System.out.println(realHeight + " " + realWidth);
    }
}
