package test.home_work_6;


import home_work_6.RegExSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegExSearchTest  {
    @Test
    public void test1(){
        RegExSearch es = new RegExSearch();
        long text1 = es.search("Мама мыла раму", "мыл");
        Assertions.assertEquals(1, text1);
    }

    @Test
    public void test2(){
        RegExSearch es = new RegExSearch();
        long text = es.search("Янина учиться", "я");
        Assertions.assertEquals(1, text);
    }

    @Test
    public void test3() {
        RegExSearch es = new RegExSearch();
        long text = es.search("Не начавши — думай, а начавши — делай", "начавши");
        Assertions.assertEquals(2, text);
    }
}
