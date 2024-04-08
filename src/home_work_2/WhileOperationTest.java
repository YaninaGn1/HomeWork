package home_work_2;


import org.junit.jupiter.api.Test;

public class WhileOperationTest {
    @Test
    public void test1(){
        WhileOperation whileOperation = new WhileOperation();
        String  index = whileOperation.writeteAll(new int[]{3,1,8,15});
        System.out.print(index);

    }

    @Test
    public void test2(){
        WhileOperation whileOperation = new WhileOperation();
        String  index = whileOperation.writeAllRevers(new int[]{3,8,15});
        System.out.print(index);

    }
    @Test
    public void test3(){
        WhileOperation whileOperation = new WhileOperation();
        String  index = whileOperation.writeTwo(new int[]{3,8,15});
        System.out.print(index);

    }

}
