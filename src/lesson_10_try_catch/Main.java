package lesson_10_try_catch;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        try { //ловим исключение на более высоком уровне
            test("3", "0");
        } catch (ArithmeticException exception) {
            System.out.println("Деление на 0.");
        }

        test("sdf", "0");

    }

    public static void test(String s1, String s2) {
        try {
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);

            int n = n1 / n2;

            System.out.println(n);
        } catch (NumberFormatException exception) {
            System.out.println("Один из параметров не число.");
        } /*catch (ArithmeticException exception) {
            System.out.println("Деление на 0.");
        } */
        System.out.println("Продолжилось выполнение метода.");
    }

}
