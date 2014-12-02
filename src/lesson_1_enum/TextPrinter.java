package lesson_1_enum;

public class TextPrinter {

    public static void showText(String text, int style){
        switch (style){
            case 0:
                System.out.println("***" + text + "***");
                break;
            case 1:
                System.out.println("|||" + text + "|||");
                break;
        }
    }

    public static void main(String[] args){
        showText("hello", 1);
    }

}
