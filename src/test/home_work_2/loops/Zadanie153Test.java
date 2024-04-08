
package test.home_work_2.loops;


import home_work_2.loops.Zadanie153;
import org.junit.jupiter.api.Test;

public class Zadanie153Test {
    Zadanie153 zadanie153 = new Zadanie153();
    @Test
    public void test1() {
        String schet = zadanie153.kolichestvo(0);
    }
    @Test
    public void test2() {
        String schet = zadanie153.kolichestvo(-6553);
    }

    @Test
    public void test3() {
        String schet = zadanie153.kolichestvo(112);
    }

}


