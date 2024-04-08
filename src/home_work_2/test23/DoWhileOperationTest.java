package home_work_2.test23;


import home_work_2.DoWhileOperation;
import org.junit.jupiter.api.Test;


public class DoWhileOperationTest {

    @Test
    public void test1(){
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        String  index = doWhileOperation.writeteAll(new int[]{3,1,8,15});
        System.out.print(index);

    }

    @Test
    public void test2(){
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        String  index = doWhileOperation.writeAllRevers(new int[]{3,8,15});
        System.out.print(index);

    }

    @Test
    public void test3(){
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        String  index = doWhileOperation.writeTwo(new int[]{3,8,15});
        System.out.print(index);

    }



}










