// 문자 찾기기


import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
	String word = scanner.next();
	char s = scanner.next().charAt(0);
    int count = 0;
    
    word = word.toLowerCase();
    s = Character.toLowerCase(s);
    
    for(int i = 0; i<word.length(); i++){
    	if(word.charAt(i) == s){
          count++;
        }
    }
    
    System.out.print(count);
  }
}