
package test.home_work_2.loops;

import home_work_2.loops.Zadanie155;
import org.junit.jupiter.api.Test;

public class Zadanie155Test {
    Zadanie155 zadanie155 = new Zadanie155();
    @Test
    public void test1() {

        String schet = Zadanie155.shag(0);
    }

    @Test
    public void test2() {

        String schet = Zadanie155.shag(-0.15);
    }
    @Test
    public void test3() {

        String schet = Zadanie155.shag(1.5);
    }

}


