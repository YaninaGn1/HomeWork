package home_work_5.dto;

import home_work_5.api.IPersons;
import home_work_5.name.Name;
import home_work_5.nick.NickPerson;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 1.1. Написать класс Person который содержит поля:
 * 		1.1.1. Строку nick - псевдоним пользователя
 * 		1.1.2. Строку password - пароль (от 5 до 10 символов)
 * 		1.1.3. Строку name - имя пользователя
 */
public class Person implements IPersons {
   private  String nick;
    private  String password;
    private  String name;

    public static void main(String[] args) {

        System.out.println("{" +
                "Имя - " +   Name.name3()    + "   " + '\'' +
                "Псевдоним - " +  NickPerson.name2() + "   " + '\'' +
                "Пароль - " + passwordAdd() + '\'' +
                '}');
          }

    public Person(String name,String nick,String password ) {
        this.nick = nick;
        this.password = password;
        this.name = name;
    }
    public String personAdd() {
        nick = NickPerson.name2();
        name = Name.name3();
        password = passwordAdd();
        return "{" +
                "Имя - " + name + "   " + '\'' +
                "Псевдоним - " + nick + "   " + '\'' +
                "Пароль - " + password + '\'' +
                '}';
    }
        public static String passwordAdd() {
            Random rnd = new Random();
            var generatedPasssword = rnd.ints(0, 100000000)
                    .limit(1)
                    .mapToObj(Integer::valueOf)
                    .collect(Collectors.toList());

            return generatedPasssword.toString();
        }

        @Override
        public String toString () {
            return "{" +
                    "Имя - " + name + "   " + '\'' +
                    "Псевдоним - " + nick + "   " + '\'' +
                    "Пароль - " + password + '\'' +
                    '}';
        }

    public    String getNick() {
        return nick;
    }

    public  String getPassword() {
        return password;
    }

    public  String getName() {
        return name;
    }

    @Override
    public String nick() {
            return nick;
    }

    @Override
    public String password() {

        return password;
    }

    @Override
    public String name() {

        return name;
    }
}
