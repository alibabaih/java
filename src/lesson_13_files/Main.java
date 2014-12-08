package lesson_13_files;
import java.io.*;
public class Main {

    public static final String FILE_NAME = "1.txt";
    public static final String DIR_NAME = "..\\";

    public static void main(String[] args) throws IOException {
        File file_1 = new File(FILE_NAME);

        //создаём файл
        if (!file_1.exists()) {
            file_1.createNewFile();
        }
        System.out.println(file_1.getCanonicalPath());

        File dir = new File(DIR_NAME);
        System.out.println(dir.getCanonicalPath());

        //просматриваем содержимое директории
        File[] files = dir.listFiles();
        for (File f: files) {
            if (f.isDirectory()){
                System.out.println(f.getName());
            } else if (f.isFile()) {
                System.out.println(f.getName());
            }
        }

        //читаем содержимое файла
        FileInputStream fileInputStream = new FileInputStream(file_1);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
        //вызываем метод, который построчно читает этот файл
        String s = null;
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }
        //закрываем файл
        reader.close();

    }

}










