package home_work_5.workWithCollections;

import home_work_5.DTO.Persons;
import home_work_5.Nick.NickPerson;
import home_work_5.name.Name;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static home_work_5.DTO.Persons.*;

public class Main1 {
    public static void main(String[] args) {
        List<Persons> person = new ArrayList<>();

            ThreadLocalRandom rnd = ThreadLocalRandom.current();

                for (int i = 0; i < 1_000_000; i++) {
                    Persons persons = new Persons(NickPerson.name2(), Name.name3(),Persons.passwordAdd());
                   person.add(persons);
                }
        System.out.println(person);
        }


    }


