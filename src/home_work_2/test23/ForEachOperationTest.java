package home_work_2.test23;

import home_work_2.ForEachOperation;
import org.junit.jupiter.api.Test;

public class ForEachOperationTest  {
    @Test
    public void test1(){
        ForEachOperation forEachOperation = new ForEachOperation();
        String  index = forEachOperation.writeteAll(new int[]{3,1,8,15});
        System.out.print(index);

    }
    @Test
    public void test2(){
        ForEachOperation forEachOperation = new ForEachOperation();
        String  index = forEachOperation.writeAllRevers(new int[]{3,8,15});
        System.out.print(index);

    }

    @Test
    public void test3(){
        ForEachOperation forEachOperation = new ForEachOperation();
        String  index = forEachOperation.writeTwo(new int[]{3,8,15});
        System.out.print(index);

    }
}
