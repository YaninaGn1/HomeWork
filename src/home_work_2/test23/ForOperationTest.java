package home_work_2.test23;


import home_work_2.ForEachOperation;
import home_work_2.ForOperation;
import org.junit.jupiter.api.Test;

public class ForOperationTest {
    @Test
    public void test1(){
        ForOperation forOperation = new ForOperation();
        String  index = forOperation.writeteAll(new int[]{3,1,8,15});
        System.out.print(index);

    }
    @Test
    public void test2(){
        ForOperation forOperation = new ForOperation();
        String  index = forOperation.writeAllRevers(new int[]{3,8,15});
        System.out.print(index);

    }

    @Test
    public void test3(){
        ForOperation forOperation = new ForOperation();
        String  index = forOperation.writeTwo(new int[]{3,8,15});
        System.out.print(index);

    }
}


