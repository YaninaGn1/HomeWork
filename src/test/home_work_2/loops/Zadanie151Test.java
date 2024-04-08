
package test.home_work_2.loops;

import home_work_2.loops.Zadanie151;
import org.junit.jupiter.api.Test;

public class Zadanie151Test {
    Zadanie151 zadanie151 = new Zadanie151();
    @Test
    public void test1() {

        double schet = Zadanie151.maxChislo(235);
    }

    @Test
    public void test2() {

        double schet = Zadanie151.maxChislo(0);
    }
    @Test
    public void test3() {

        double schet = Zadanie151.maxChislo(-3);
    }

}


