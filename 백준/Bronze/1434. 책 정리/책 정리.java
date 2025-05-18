import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int M = sc.nextInt(); 

        int[] boxCapacities = new int[N];
        int[] bookSizes = new int[M];

        for (int i = 0; i < N; i++) {
            boxCapacities[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            bookSizes[i] = sc.nextInt();
        }

        int boxIndex = 0;
        int currentBoxUsed = 0; 
        int[] boxUsed = new int[N]; 

        for (int i = 0; i < M; i++) {
            int book = bookSizes[i];

            while (boxIndex < N) {
                if (currentBoxUsed + book <= boxCapacities[boxIndex]) {
                    
                    currentBoxUsed += book;
                    boxUsed[boxIndex] = currentBoxUsed;
                    break;
                } else {
                    
                    boxIndex++;
                    currentBoxUsed = 0;
                }
            }


            if (boxIndex == N) {
                break;
            }
        }


        int wasted = 0;
        for (int i = 0; i < N; i++) {
            wasted += boxCapacities[i] - boxUsed[i];
        }

        System.out.println(wasted);
    }
}
