import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] x = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
        }

        Arrays.sort(x);

        long sum = 0;
        long prefixSum = 0;

        for (int i = 0; i < n; i++) {
            
            sum += x[i] * i - prefixSum;
            prefixSum += x[i];
        }

        System.out.println(sum * 2);
    }
}
