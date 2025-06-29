import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt(); 
        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        int C = sc.nextInt(); 
        int D = sc.nextInt(); 

        int koreanDays = (int) Math.ceil((double) A / C); 
        int mathDays = (int) Math.ceil((double) B / D);   

        int studyDays = Math.max(koreanDays, mathDays);   
        System.out.println(L - studyDays);                
    }
}
