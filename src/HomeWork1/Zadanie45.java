package HomeWork1;
import java.util.Scanner;

public class Zadanie45 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("write  kod ");
        int name1 = console.nextInt();

boolean n = 'A' < name1 && name1 < 'Z' || 'a' < name1 && name1 < 'z';

       if(n) {
      System.out.println("Это код английской буквы " );
       } else {
           System.out.println("Это код иного символа " );
       }
    }
}
