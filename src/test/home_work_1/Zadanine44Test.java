package test.home_work_1;
import home_work_1.Zadanine44;

import org.junit.jupiter.api.Test;

public class Zadanine44Test {
    Zadanine44 zadanie44 = new Zadanine44();

     @Test
    public void  testTen(){
        double a = zadanie44.perevod(10);
    }

    @Test
    public void  testNull(){
        double a = zadanie44.perevod(0);
    }

    @Test
    public void  testMinus(){
        double a = zadanie44.perevod(-5);
    }
}
