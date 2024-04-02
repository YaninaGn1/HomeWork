package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T> {
    private T[] data;
    private T item;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Добовляет в себя данные
     */
    public int add(T item) {
        if (item == null) {
            return (-1);
        } else {
            for (int a = 0; a < data.length; a++) {
                if (data[a] == null) {
                    data[a] = item;
                    return a;
                }

            }
            data = Arrays.copyOf(data, data.length + 1);
            data[data.length - 1] = item;
            return data.length - 1;
        }
    }

    public T get(int index) {
        if (index > data.length) {
            return null;
        } else {
            return data[index];
        }
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete(int index) {
        if (index > data.length - 1) {
            return false;
        } else if (index == 0) {
            data = Arrays.copyOfRange(data, 1, data.length - 1);
            return true;
        } else if (index == data.length - 1) {
            data = Arrays.copyOfRange(data, 0, data.length - 1);
            return true;
        } else {
            T [] arr = Arrays.copyOfRange(data, 0,index);
            T [] arr1 = Arrays.copyOfRange(data, index + 1, data.length);
            data = Arrays.copyOf(data, data.length - 1);
            System.arraycopy(arr, 0, data, 0,   data.length + 1 - index);
            System.arraycopy(arr1, 0, data, index,   data.length + 1 );
            return true;
        }

    }

    public boolean delete(T item) {
        if (item == null) {
            return false;
        } else {
            for (int i = 0; i < data.length; i++) {
                if (i == data.length - 1) {
                    data = Arrays.copyOf(data, data.length - 1);
                    return true;
                } else if (i == 0) {
                    data = Arrays.copyOfRange(data, 1, data.length - 1);
                    return true;
                } else {
                    T[] arr;
                    arr = Arrays.copyOf(data, data.length - 1);
                    System.arraycopy(data, i + 1, arr, i, data.length - 1 - i);
                    data = arr;
                    return true;
                }

            }
            return false;
        }
    }
       public void sort (Comparator<T> comparator) {

            for (int i = 0; i < data.length - 1; i++) {
            for (int j = (data.length - 1); j > i; j--) {
           if (comparator.compare(data[j - 1], data[j]) > 0) {
              T temp = data[j - 1];
             data[j - 1] = data[j];
              data[j] = temp;
              }
             }
            }
    }
}








