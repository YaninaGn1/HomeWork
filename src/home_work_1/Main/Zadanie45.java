package home_work_1.Main;


import java.util.Scanner;

public class Zadanie45 {

    private int name1;
    public Zadanie45() {
        this.name1 = name1;
    }

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("write  kod ");
        int name1 = console.nextInt();

        System.out.print(proverka(name1));
    }

    /**
      Буква или иной символ
     * @return true если код означает букву
     * @return false если код обозначает иной символ
     */
    public static boolean proverka(int name1) {

        if ('A' < name1 && name1 < 'Z') {
            System.out.println("Это код английской буквы ");
            return true;
        } else if ( 'a' < name1 && name1 < 'z') {
            System.out.println("Это код английской буквы ");
            return true;
        } else {
            System.out.println("Это код иного символа ");
            return false;
        }
     }
}
