package lesson_5_oop;
import static java.lang.System.out;

public class Program {

    public static void main(String[] args) {

        Person person_1 = new Person("Vasily", 25);
        Person person_2 = new Person("Alex", 20);
        Person person_3 = new Person();
//        person_1.show();
//        person_2.show();
//        person_3.show();
//        out.println(Person.counter);
        Person.showTotalUsers(); // now it works thorough Collection method

    }

}
