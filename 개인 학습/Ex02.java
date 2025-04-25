import java.util.Scanner;




// 내 풀이
public class Main {
    public static String Solution(String input){
        StringBuilder sb = new StringBuilder(input);

        for(int i = 0; i<input.length(); i++){
            
            if(input.charAt(i) <= 'Z' && input.charAt(i)>='A'){
                sb.setCharAt(i, Character.toLowerCase(input.charAt(i)));
            }else if(input.charAt(i) <= 'z' && input.charAt(i)>='a'){
                sb.setCharAt(i, Character.toUpperCase(input.charAt(i)));
            }
        }
        return sb.toString();
    }


  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    String answer = Solution(input);
    
    System.out.print(answer);
  }
}