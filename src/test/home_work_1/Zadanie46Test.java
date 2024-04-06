package test.home_work_1;

import home_work_1.Zadanie46;
import org.junit.jupiter.api.Test;

public class Zadanie46Test {

        /**
         * 4.6 Определить високосный год или нет
         */
        Zadanie46 zadanie46 = new Zadanie46();

    @Test
    public void  test2024(){
        double a = zadanie46.proverka(2024);
    }

    @Test
    public void  test2023(){
        double a = zadanie46.proverka(2023);
    }

    @Test
    public void  test0(){
        double a = zadanie46.proverka(0);
    }

    @Test
    public void  testMinus(){
        double a = zadanie46.proverka(-2023);
    }
}