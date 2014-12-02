package lesson_1_enum;

public class TextPrinter {

    public static void showText(String text, EStyle style){
//        switch (style){
//            case DOLLAR_STYLE:
//                System.out.println("***" + text + "***");
//                break;
//            case LINE_STYLE:
//                System.out.println("|||" + text + "|||");
//                break;
//            default:
//                System.out.println(" " + text + " ");
//        }
        System.out.println(style.getStyleString() + text + style.getStyleString());
    }

    public static void main(String[] args){
        showText("hello", EStyle.DOLLAR_STYLE);
        showText("hello", EStyle.valueOf("LINE_STYLE")); //automation conversation
        //showText("hello", EStyle.valueOf("ha-ha")); //throw exception
        for (EStyle style : EStyle.values()){
            showText("All styles", style); //array of all allowed styles
        }

        System.out.println("Supported styles: ");
        for (EStyle style : EStyle.values()){
            System.out.println("— " + style.toString());
        }

    }

}
