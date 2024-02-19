package HomeWork1;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("write name ");
        String name1 = in.nextLine();

        String name = "Вася";

        if (name.equals(name1)) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.print("Добрый день, а вы кто?");
        }
    }
}




