package home_work_5.workWithCollections;

import home_work_5.comparators.animals.AnimalAgeByComparator;
import home_work_5.dto.Animal;
import home_work_5.nick.NickAnimal;
import java.util.ArrayList;



public class MainArrayAnimalList {
    public static void main(String[] args) {

        ArrayList<Animal> animal = new ArrayList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 15; i++) {
            Animal animals = new Animal(Animal.agedAdd(), NickAnimal.name3());
            animal.add(animals);

        }
        long stop = System.currentTimeMillis();

        animal.sort(new AnimalAgeByComparator());
        System.out.println(animal);

        }
    }








