package test.home_work_1;

import home_work_1.Zadanie63;
import org.junit.jupiter.api.Test;

public class Zadanie63Test {
    Zadanie63 zadanie63 = new Zadanie63();

    @Test
    public void  test1(){
        String a = zadanie63.welcom(" ");
    }
    @Test
    public void  test2(){
        String a = zadanie63.welcom("Анастасия");
    }

    @Test
    public void  test3(){
        String a = zadanie63.welcom("Yana");
    }
}
