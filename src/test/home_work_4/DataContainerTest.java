package test.home_work_4;

import home_work_4.DataContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;


public class DataContainerTest{

    @Test
    public void testAddNotNull(){
        DataContainer<String> container = new DataContainer<>(new String[]{null, "не", "получается", "делать все"});
        int index = container.add("Привет");
        String answer = container.get(index);

        Assertions.assertEquals(answer,"Привет");
    }
    @Test
    public void testAdd1(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
        int index = container.add(777);
        Integer answer = container.get(index);

        Assertions.assertEquals(answer,777);
    }

    @Test
    public void testDeleteByIndex(){
        DataContainer<String> container = new DataContainer<>(new String[0]);
        int index = container.add("Привет");
        container.delete(index);
        String answer = container.get(index);

        Assertions.assertEquals(answer,null);
    }
    @Test
    public void testDeleteByItem(){
        DataContainer container = new DataContainer(new String[0]);
        int index = container.add("Привет");
        container.delete("Привет");
        String answer = (String) container.get(index);

        Assertions.assertEquals(answer,null);
    }

}










