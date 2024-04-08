
package test.home_work_2.loops;

import home_work_2.loops.Zadanine12;
import org.junit.jupiter.api.Test;

public class Zadanie12Test {
    Zadanine12 Zadanine12 = new Zadanine12();
    @Test
    public void testNull() {
        double schet = Zadanine12.umnozenieInt(0);
    }

    @Test
    public void test181232375() {
        double schet = Zadanine12.umnozenieInt(181232375);
    }

    @Test
    public void test99() {
        double schet = Zadanine12.umnozenieDouble(99.2);
    }

    @Test
    public void testPrivet() {
        String  schet = Zadanine12.umnozenieString("Привет");
    }
}


