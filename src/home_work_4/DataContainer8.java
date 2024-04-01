package home_work_4;

import java.util.Arrays;

public class DataContainer8 {
    public static void main(String[] args) {
        Integer[] zadanie8 = {1,2,3,777};
        DataContainer<Integer> container8 = new DataContainer<>(zadanie8);

        System.out.println(container8.delete (null));
        System.out.println(Arrays.toString((container8.getItems())));

        Integer[] zadanie812 = {1,2,3,777, null};
        DataContainer<Integer> container812 = new DataContainer<>(zadanie812);
        System.out.println(container8.delete (null));

        Integer[] zadanie831 = {1,2,3,777};
        DataContainer<Integer> container831 = new DataContainer<>(zadanie831);
        System.out.println(container831.delete (111));

        Integer[] zadanie821 = {1,2,3,777};
        DataContainer<Integer> container821 = new DataContainer<>(zadanie821);
        System.out.println(container831.delete (777));
    }
}
