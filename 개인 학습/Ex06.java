import java.util.Scanner;
  
public class Main {
    
    public static void solution(String input) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i= 0; i<input.length(); i++){
            if(set.contains(input.charAt(i))) continue;
            set.add(input.charAt(i));
            sb.append(c);
        }

        System.out.println(sb.toString());


    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input = scanner.next();

        solution(input);

    }
}