import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<10; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++){
            set.add(numbers[i] % 42);
        }

        System.out.println(set.size());
        sc.close();
    }
}
