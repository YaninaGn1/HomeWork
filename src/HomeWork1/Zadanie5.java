package HomeWork1;
import java.util.Scanner;

public class Zadanie5 {


  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    System.out.print("write ");
    boolean n = console.nextBoolean();
  }
    static boolean sleepIn( boolean weekday, boolean vacation) {
        if (weekday == false && vacation == false) {
            System.out.println("Иди на работу" );
            return true;
        } else if (weekday == false && vacation == true) {
            System.out.println("Спи" );
            return true;
        } else if (weekday == true && vacation == false) {
            System.out.println("Иди на работу" );
            return false;
        } else {
            System.out.println("Спи" );
            return true;
        }
  }
}



