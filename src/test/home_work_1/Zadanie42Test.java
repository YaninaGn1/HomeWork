package test.home_work_1;

import home_work_1.Zadanie42;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Zadanie42Test {

    /**
     * 4.2 Среди трёх чисел найти среднее
     */
    @DisplayName("Все числа 0")
    @Test
   public void  testNull(){
        Zadanie42 zadanie42 = new Zadanie42();
        double a = zadanie42.srednie(0,0,0);
        }

    @DisplayName("Все числа отрицательные")
    @Test
    public void  testMinus(){
        Zadanie42 zadanie42 = new Zadanie42();
        double a = zadanie42.srednie(-1,-6,-3);
    }

    @DisplayName("Два числа одинаковые")
    @Test
    public void  test1(){
        Zadanie42 zadanie42 = new Zadanie42();
        double a = zadanie42.srednie(-1,-1,-0);
    }

    }

