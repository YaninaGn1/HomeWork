package home_work_5.workWithCollections;

import home_work_5.comparators.persons.PersomNickByComparator;
import home_work_5.dto.Person;
import home_work_5.name.Name;
import home_work_5.nick.NickPerson;
import java.util.ArrayList;

import java.util.ListIterator;


public class MainArrayList {
    public static void main(String[] args) {

        ArrayList<Person> person = new ArrayList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            Person persons = new Person(Name.name3(), NickPerson.name2(), Person.passwordAdd());
            person.add(persons);

        }
        long stop = System.currentTimeMillis();



        ListIterator<Person> listIter = person.listIterator();
        long start1 = System.currentTimeMillis();
        while (listIter.hasNext()) {
            System.out.println(listIter.next());
        }
        long stop1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        listIter.remove();
        long stop2 = System.currentTimeMillis();

        person.sort(new PersomNickByComparator());
        System.out.println(person);

        //  long start3 = System.currentTimeMillis();
        //  for (Person persons : person) {
        //        System.out.println(person);
        //    }
         //   long stop3 = System.currentTimeMillis();


            System.out.println("Операция: Заполнения коллекции. Заняла: " + (stop - start) + " мс");
            System.out.println("Операция: Итерирования коллекции. Заняла: " + (stop1 - start1) + " мс");
        //    System.out.println("Операция: Итерирования коллекции1. Заняла: " + (stop3 - start3) + " мс");
            System.out.println("Операция: Удаление коллекции. Заняла: " + (stop2 - start2) + " мс");
        }
    }








