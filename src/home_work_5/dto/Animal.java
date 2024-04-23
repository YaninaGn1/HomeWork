package home_work_5.dto;

import home_work_5.api.IAnimals;
import home_work_5.nick.NickAnimal;

import java.util.Random;

/**
 * 1.2. Написать класс Animal:
 * 		1.2.1. Число age - возраст (от 1 до 15 лет)
 * 		1.2.2. Строка nick - кличка
 */
public class Animal implements IAnimals {
    private int age;
   private String nick;

    public static void main(String[] args) {

        System.out.println("{" +
                "Имя - " + NickAnimal.name3() + "  "+ '\'' +
                "Возраст - " + agedAdd() + '\'' +
                '}');
    }

    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }
    public   String animalAdd() {
    nick = NickAnimal.name3();
    age = agedAdd();
    return "{" +
            "Имя - " + nick + "  "+ '\'' +
            "Возраст - " + age + '\'' +
            '}';}

      public  static int agedAdd() {
         Random rnd = new Random();
         int maxValue =15;
         int minValue =1;
        int min = maxValue-minValue+1;
        return rnd.nextInt(min+minValue);
    }

    @Override
    public String nick() {
        return nick;
    }

    @Override
    public int age() {
        return age;
    }
    @Override
    public String toString() {
        return "{" +
                "Имя - " + nick + "   "+'\'' +
                "Возраст - " + age + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }
}


