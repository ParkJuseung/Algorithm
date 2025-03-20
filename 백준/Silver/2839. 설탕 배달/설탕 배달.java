import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  
        scanner.close();
        
        int count = -1; 


        for (int i = N / 5; i >= 0; i--) {
            int remaining = N - (i * 5); 
            if (remaining % 3 == 0) { 
                count = i + (remaining / 3);
                break;
            }
        }
        
        System.out.println(count);
    }
}
