package home_work_1;

public class Zadanie42 {
    private double a, b, c;
    public Zadanie42(){

        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     * 4.2 Среди трёх чисел найти среднее
     */
   public static double srednie(double a, double b, double c){
        if (b < c & b > a){
            System.out.println("среднее " + b);
            return 1;
        } else if (b < a & a < c){
                System.out.println("среднее " + a);
            return 0;
            } else {
                System.out.println("среднее " + c);
            return -1;
            }
        }

    }

