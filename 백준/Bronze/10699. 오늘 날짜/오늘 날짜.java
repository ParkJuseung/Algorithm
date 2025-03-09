import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getTime().toInstant().toString().substring(0,10));
    }
}
