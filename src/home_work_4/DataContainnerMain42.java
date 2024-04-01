package home_work_4;

public class DataContainnerMain42 {
    public static void main(String[] args) {
        Integer[] zadanie421 = {1, 2, 3};
        DataContainer<Integer> container4 = new DataContainer<>(zadanie421);
        int k4 =  container4.add (777);
        System.out.println(k4);

        Integer[] zadanie422 = {};
        DataContainer<Integer> container422 = new DataContainer<>(zadanie422);
        int k422 =  container422.add (777);
        System.out.println(k422);
    }
}
