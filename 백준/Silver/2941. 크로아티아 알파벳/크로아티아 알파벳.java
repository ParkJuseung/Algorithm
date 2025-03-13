
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String[] croatia = {"dz=", "lj", "nj", "c=", "c-", "d-", "s=", "z="};

        for(String c : croatia){
            input = input.replace(c,"A");
        }

        System.out.println(input.length());

    }
}