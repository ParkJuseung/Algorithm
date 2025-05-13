import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int[] seats = new int[101]; 
        int rejectedCount = 0; 

        for (int i = 0; i < N; i++) {
            int seatNumber = sc.nextInt();
            if (seats[seatNumber] == 0) {
                seats[seatNumber] = 1; 
            } else {
                rejectedCount++; 
            }
        }

        System.out.println(rejectedCount);
    }
}
