package home_work_5.workWithCollections;

import home_work_5.comparators.persons.PersomNickByComparator;
import home_work_5.dto.Person;
import home_work_5.name.Name;
import home_work_5.nick.NickPerson;

import java.util.Iterator;
import java.util.TreeSet;


public class MainTreeSet {
    public static void main(String[] args) {
        TreeSet<Person> person = new TreeSet<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            Person persons = new Person(Name.name3(), NickPerson.name2(), Person.passwordAdd());
            person.add(persons);
        }
        long stop = System.currentTimeMillis();

        System.out.println(person);


        Iterator<Person> set = person.iterator();
         long start1 = System.currentTimeMillis();
      while (set.hasNext()) {
              System.out.println(set.next());
          }
         long stop1 = System.currentTimeMillis();
        System.out.println("Операция: Заполнения коллекции. Заняла: " + (stop - start) + " мс");
       System.out.println("Операция: Итерирования коллекции. Заняла: " + (stop1 - start1) + " мс");

       // person.sort(new PersomNickByComparator());
        System.out.println(person);

        long start2 = System.currentTimeMillis();
        set.remove();
        long stop2 = System.currentTimeMillis();
        System.out.println("Операция: Удаление коллекции. Заняла: " + (stop2 - start2) + " мс");
    }
}


