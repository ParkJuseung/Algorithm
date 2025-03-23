import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len  = scanner.nextInt();
        ArrayList<Integer> result = new ArrayList<>();

        Queue<Integer> cards = new LinkedList<>();

        for(int i=1; i<=len; i++){
            cards.add(i);
        }

        while(cards.size() > 1) {
            result.add(cards.poll());
            cards.add(cards.poll());
        }

        for(int num : result){
            System.out.print(num + " ");
        }
        System.out.println(cards.peek()); 
    }
}

