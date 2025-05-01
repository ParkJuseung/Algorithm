import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    String[] arr = input.split("\\s+");
    
    int max = 0;
    String answer = "";

    for(int i = 0; i<arr.length; i++){
        if(arr[i].length() > max){
            max = arr[i].length();
            answer = arr[i];
        }
    }

    System.out.print(answer);
  }
}