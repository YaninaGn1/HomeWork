package test.home_work_6;

import home_work_6.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EasySearchTest  {


    @Test
    public void test1(){
        EasySearch es = new EasySearch();
        long text1 = es.search("Мама мыла раму", "мыл");
        Assertions.assertEquals(1, text1);
    }

    @Test
    public void test2(){
        EasySearch es = new EasySearch();
        long text = es.search("Янина учиться", "я");
        Assertions.assertEquals(1, text);
    }

    @Test
    public void test3(){
        EasySearch es = new EasySearch();
        long text = es.search("Не начавши — думай, а начавши — делай", "начавши");
        Assertions.assertEquals(2, text);
    }
    @Test
    public void test4(){
        EasySearch es = new EasySearch();
        long text = es.search("Привет-привет", "привет");
        Assertions.assertEquals(1, text);
    }
    @Test
    public void test5(){
        EasySearch es = new EasySearch();
        long text = es.search("Привет-привет", "java");
        Assertions.assertEquals(-1, text);
    }
}
