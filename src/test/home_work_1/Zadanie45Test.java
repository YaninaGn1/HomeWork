package test.home_work_1;

import home_work_1.Main.Zadanie45;
import org.junit.jupiter.api.Test;

public class Zadanie45Test {
    Zadanie45 zadanie45 = new Zadanie45();

    @Test
    public void  test24(){
        boolean a = zadanie45.proverka(24);
    }

    @Test
    public void  test0(){
        boolean a = zadanie45.proverka(0);
    }

    @Test
    public void  testMinus(){
        boolean a = zadanie45.proverka(-6);
    }
    @Test
    public void  test116(){
        boolean a = zadanie45.proverka(116);
    }

}
