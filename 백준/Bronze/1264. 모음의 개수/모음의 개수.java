import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      String line = scanner.nextLine();
      if (line.equals("#")) {
        break;
      }

      int count = 0;
      for (char c : line.toLowerCase().toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
          count++;
        }
      }

      System.out.println(count);
    }

    scanner.close();
  }
}
