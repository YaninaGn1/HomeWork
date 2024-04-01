package home_work_4;

public class DataContainer7 {
    public static void main(String[] args) {
        Integer[] zadanie711 = {1,2,3,777};
        DataContainer<Integer> container711 = new DataContainer<>(zadanie711);

        System.out.println(container711.delete (3));
        System.out.println(container711.delete (9));
        System.out.println(container711.delete (2));
    }
}
