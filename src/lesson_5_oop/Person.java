package lesson_5_oop;

import static java.lang.System.out;
import java.util.ArrayList;

public class Person {

    public String name;
    public int age;

    public static int counter = 0; // счётчик пользователей инкрементируется в наиболее общем конструкторе

    static ArrayList<Person> persons = new ArrayList<Person>(); //создаём типизированную коллекцию



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;

        persons.add(this);
    }

    public Person() {
        counter++;
        persons.add(this);
    }

    public static void showCollection(){
        for (Person person : persons){ //Person т.к. коллекция типизированная
            person.show();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        out.println("Your name is: " + name + " and you " + age + " years");
    }

    public static void showTotalUsers() {
        //out.println(counter);
        Person.showCollection();
    }



}
