package home_work_1;

public class zadanie2 {
    public static void main(String[] args) {

       int k1, k2, k3, k4, k5, k6, k7, k8 ;
       boolean k9;
       int c = 8;

        k1 = 5 + 2 / 8;
        k2 = (5+2)/8;
        // k3 = (5 + 2++) / 8;// ошибка типа, получаеться вещественное число
        // k4 = (5 + 2++) / --c; // ошибка типа, получаеться вещественное число
        // k5 = (5 * 2 >> 2++) / --c; // ошибка типа. получаеться вещественное число
        // k6 = (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --c; // ошибка типа, получаеться вещественное число
        // k7 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) /-- c;// ошибка типа и неправильные типы для бинарного оператора
        // k8 = 6 - 2 > 3 && 12 * 12 <= 119; //логическое значение (бинарный оператор &&) нельзя  проеобразовать в целочисленное
        k9 = true && false;

        System.out.println("k1 =" + k1);
        System.out.println("k2 =" + k2);
         //System.out.println("k3 =" + k3);
        // System.out.println("k4 =" + k4);
        // System.out.println("k5 =" + k5);
        // System.out.println("k6 =" + k6);
        // System.out.println("k7 =" + k7);
        // System.out.println("k8 =" + k8);
        System.out.println("k9 =" + k9);
    }
}
