package home_work_5.comparators.animals;
import home_work_5.dto.Animal;

import java.util.Comparator;

public class AnimalNickByComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal animal1, Animal animal2) {
        int age = animal1.getAge() - animal2.getAge();
        if(animal1 == null && animal2 == null){
            return 0;
        }

        if(animal1 == null && animal2 != null){
            return -1;
        }

        if(animal1 != null && animal2 == null){
            return 1;
        }

        return animal1.getNick().compareTo(animal2.getNick());
    }


}
