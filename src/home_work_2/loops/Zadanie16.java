/*
 1.6. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке (динозаврика рисовать не надо): https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
 */
package home_work_2.loops;

public class Zadanie16 {
    private static int i;
    private static int j;
    public static int tablica() {

        for (i = 1; i <= 10; i++ ) {
            for (j = 2; j <= 5; j++){
                System.out.print( j + "x" + i + "="+ (i*j) +"\t" );
            }
            System.out.println();
        }
        System.out.println();

          for (i = 1; i <= 10; i++ ) {
               for (j = 6; j <= 9; j++){
                   System.out.print( j + "x" + i + "="+ (i*j)+"\t" );
                }
               System.out.println();
         }
          return 0;
    }
}

