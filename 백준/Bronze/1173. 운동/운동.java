import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int m = sc.nextInt(); 
        int M = sc.nextInt(); 
        int T = sc.nextInt(); 
        int R = sc.nextInt(); 

        if (m + T > M) {
            
            System.out.println(-1);
            return;
        }

        int currentPulse = m;
        int time = 0;
        int exerciseMinutes = 0;

        while (exerciseMinutes < N) {
            if (currentPulse + T <= M) {
                
                currentPulse += T;
                exerciseMinutes++;
            } else {
               
                currentPulse -= R;
                if (currentPulse < m) {
                    currentPulse = m;
                }
            }
            time++;
        }

        System.out.println(time);
    }
}
