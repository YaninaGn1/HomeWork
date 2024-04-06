package test.home_work_1;
import home_work_1.Zadanie43;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Zadanie43Test {
    /**
     * 4.3 Проверка делимости одного числа на другое
     */
    Zadanie43 zadanie43 = new Zadanie43();

        @DisplayName("Все числа отрицательные")
        @Test
        public void  testMinus1(){
          double a = zadanie43.delimost(-2,-4);
        }

    @DisplayName("Все числа отрицательные")
    @Test
    public void  testMinus2(){
        double a = zadanie43.delimost(-4,-2);
    }

    @DisplayName("Все числа одинаковые")
    @Test
    public void  testRavno(){
        double a = zadanie43.delimost(-4,-4);
    }

    @DisplayName("Одно из числе 0")
    @Test
    public void  testNull(){
        double a = zadanie43.delimost(2,0);
    }

}

