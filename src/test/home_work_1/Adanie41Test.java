package test.home_work_1;
import home_work_1.Adanie41;
import org.junit.jupiter.api.*;

public class Adanie41Test {

    @DisplayName("Проверка на четность 0")
    @Test
        public void testNull() {
        Adanie41 adanie41 = new Adanie41();
        double schet = adanie41.chetnost(0);
    }
    @DisplayName("Проверка отрицательного числа")
    @Test
    public void testMinus() {
        Adanie41 adanie41 = new Adanie41();
        double schet = adanie41.chetnost(-3);
    }
    @DisplayName("Проверка вещественного  числа")
    @Test
    public void testDouble() {
        Adanie41 adanie41 = new Adanie41();
        double schet = adanie41.chetnost(-5.25);
    }
}


