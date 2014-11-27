package practice.vasiliy;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import static java.lang.System.out;

class Main {

    public static void main (String[] args){
        //out.println("Hello world!");

        ArrayList<String> persons = new ArrayList<String>();
        Collection<String> names = persons;

        out.println(persons.size());

        persons.add("Сергей");
        persons.add("Николай");
        persons.add("Валерий");
        persons.add("Наталья");

        out.println(persons.size());

        for (int i=0; i < persons.size(); i++){
            out.println(persons.get(i));
        }

//        Iterator<String> iterator = names.iterator();
//        while (iterator.hasNext()){
//            out.println(iterator.next());
//        }
        for (String name : names){
            out.println(name);
        }

    }

}