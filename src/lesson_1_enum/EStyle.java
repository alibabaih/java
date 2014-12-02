package lesson_1_enum;

public enum EStyle { //this class cannot extends another classes
                     //but you can implement an interface

    //enum forbid create instance out of this enum
    //described two instance of this class
    //DOLLAR_STYLE, LINE_STYLE;
    DOLLAR_STYLE("$$$"), LINE_STYLE("|||"), EMPTY_STYLE; //because constructor with var

    private final String styleString;

    private EStyle(String styleString) {
        this.styleString = styleString;
    }

    private EStyle() {
        this.styleString = "";
    }

    public String getStyleString() {
        return styleString;
    }
}
