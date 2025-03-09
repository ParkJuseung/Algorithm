import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();  
        int num2 = sc.nextInt();  

        int num2_1 = num2 % 10;               
        int num2_2 = (num2 / 10) % 10;        
        int num2_3 = num2 / 100;          

        int step3 = num1 * num2_1;
        int step4 = num1 * num2_2;
        int step5 = num1 * num2_3;
        int step6 = num1 * num2;

        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);

        sc.close();
    }
}
