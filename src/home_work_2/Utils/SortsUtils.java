package home_work_2.Utils;
import java.util.Scanner;
public class SortsUtils {
    public static void sort(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.print("Напишите размер массива ");
        int container = in.nextInt();
        int array[] = new int[container];

        System.out.print("Напишите элементы массива ");
        for (int i = 0; i < container; i++) {
            array[i] = in.nextInt();
            System.out.print(" " + array[i]);
     //   }
     //   System.out.println();
     //   for (int i = 0; i < container - 1; i++) {
    //        for (int j = (container - 1); j > i; j--) {
       //         if (i[j - 1] > i[j]) {
                  //  int temp = i[j - 1];
                  //  i[j - 1] = i[j];
                  //  i[j] = temp;
                }
            }

        }

   // }
//}
