import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int loopNum = scanner.nextInt();
        
        for(int i = 1; i<=loopNum; i++){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i, num1, num2, num1 + num2);
        }
    }
}