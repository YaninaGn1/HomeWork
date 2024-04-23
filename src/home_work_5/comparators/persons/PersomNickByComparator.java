package home_work_5.comparators.persons;

import home_work_5.dto.Person;

import java.util.Comparator;

public class PersomNickByComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int password =  person1.getPassword().length() - (person2.getPassword().length());;

        if (person1 == null && person2 == null) {
            return 0;
        }

        if (person1 == null && person2 != null) {
            return -1;
        }

        if (person1 != null && person2 == null) {
            return 1;
        }

        return person1.getNick().compareTo(person2.getNick());

    }
}



