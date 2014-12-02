package lesson_1_enum;

public class TextPrinter {

    public static void showText(String text, Style style){
//        switch (style){
//            case 0:
//                System.out.println("***" + text + "***");
//                break;
//            case 1:
//                System.out.println("|||" + text + "|||");
//                break;
//            default:
//                System.out.println(" " + text + " ");
//        }
        if (style == Style.DOLLAR_STYLE){
            System.out.println("$$$" + text + "$$$");
        } else if (style == Style.LINE_STYLE){
            System.out.println("|||" + text + "|||");
        }
    }

    public static void main(String[] args){
        showText("hello", Style.DOLLAR_STYLE);
    }

}
