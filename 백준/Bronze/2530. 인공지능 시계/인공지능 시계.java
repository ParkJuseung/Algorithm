import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();

        int cookTime = sc.nextInt();

        int totalSeconds = hour * 3600 + minute * 60 + second + cookTime;

        int endHour = (totalSeconds / 3600) % 24;   
        int endMinute = (totalSeconds % 3600) / 60;
        int endSecond = totalSeconds % 60;

        System.out.println(endHour + " " + endMinute + " " + endSecond);
    }
}
