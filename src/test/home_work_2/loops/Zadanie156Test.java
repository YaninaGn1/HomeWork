
package test.home_work_2.loops;

import home_work_2.loops.Zadanina156;
import org.junit.jupiter.api.Test;

public class Zadanie156Test {
    Zadanina156 zadanine156 = new Zadanina156();
    @Test
    public void testNull() {
        double schet = Zadanina156.perevorot(0);
    }

    @Test
    public void test1() {
        double schet = Zadanina156.perevorot(-236);
    }

    @Test
    public void test2() {
        int schet = Zadanina156.perevorot(236);
    }

}


