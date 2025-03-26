import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1  = scanner.nextInt();
        int num2  = scanner.nextInt();

        int gcd = gcd(num1,num2);
        int lcm = lcm(num1,num2);
        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}

