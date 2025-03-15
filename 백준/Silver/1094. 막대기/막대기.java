import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result_length = scanner.nextInt(); // 원하는 막대 길이
        int count = 0; // 붙이는 막대 개수
        int current_length = 64; // 처음 가지고 있는 막대
        int total = 64; // 현재 남아있는 막대 길이의 합


        //남아있는 막대 > 원하는 막대 길이
        while(total > result_length){
            // 현재 가지고 있는 막대를 반으로 자름 
            int shortest_stick = current_length/2;

            // 막대 길이의 합 - 반으로 자른 막대의 길이  > 원하는 막대 길이
            if (total - shortest_stick >= result_length){
                total -= shortest_stick; // 다른 한쪽의 막대는 버림
            }else{
                count++;
            }

            // 막대 업데이트
            current_length = shortest_stick;
        }
        System.out.println(count + 1);
    }

}
