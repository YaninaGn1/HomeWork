package home_work_1;

public class Zadanine44 {
    private double a ;

    public Zadanine44(){

        this.a = a;
         }

    /** 4.4 Перевести байты в килобайты или наоборот
     *  вернуть  0.0 если перевод удался
     *  вернуть  -1.0 если перевод не удался
     */
    public static double perevod(double a){

        if (a > 0){
            System.out.println("Колличество килобайт " + (a * 1024) );
            System.out.println("Колличество байт " + (a / 1024) );
            return 0;
        }  else{
            System.out.println("Введите правильное число");
            return -1;
        }
    }

}
