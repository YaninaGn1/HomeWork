package home_work_4;

public class Container5 {
    public static void main(String[] args) {
        Integer[] zadanie51 = {};
        DataContainer<Integer> container51 = new DataContainer<>(zadanie51);
        int k51 =  container51.add (9999);
        System.out.println(k51);
        System.out.println(container51.get (k51));
        System.out.println(container51.get (1));
    }
}
