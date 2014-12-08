//заполнить словарь и перевести

package lesson_11_dictionary;
import java.io.*;
import java.util.*;

public class Main {

    static Map<String, String> dictionary = new Hashtable<>();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void updateDictionary() throws IOException {
        String eng, rus;
        do {
            System.out.println("English word: ");
            eng = reader.readLine();
            if(!eng.isEmpty()) {
                System.out.println("Translator: ");
                rus = reader.readLine();
                if(!rus.isEmpty()) {
                    dictionary.put(eng, rus);
                }
            }
        } while(!eng.isEmpty());
    }

    public static void translate() throws IOException {
        String eng, rus;
        do {
            System.out.println("Enter English word: ");
            eng = reader.readLine();
            if(!eng.isEmpty()) {
               if(dictionary.containsKey(eng)) {
                   rus = dictionary.get(eng);
                   System.out.println("Russian translator: " + rus);
               }
            }
        } while(!eng.isEmpty());
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Ввод словаря");
        updateDictionary();
        System.out.println("Теперь можно переводить");
        translate();

    }



}
