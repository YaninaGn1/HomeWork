package home_work_4;
import home_work_4.DataContainer;

public class DataContainnerMain {
    public static void main(String[] args) {
        Integer[] zadanie411 = {1, 2, 3, null, null, null};
        DataContainer<Integer> container1 = new DataContainer<>(zadanie411);
      int k =  container1.add (777);
        System.out.println(k);

        Integer[] zadanie412 = {1, 2, 3, null, null, null};
        DataContainer<Integer> container2 = new DataContainer<>(zadanie412);
        int k2 =  container2.add (null);
        System.out.println(k2);

        Integer[] zadanie413 = {1, null, 3, null, null, null};
        DataContainer<Integer> container3 = new DataContainer<>(zadanie413);
        int k3 =  container3.add (777);
        System.out.println(k3);
    }
}