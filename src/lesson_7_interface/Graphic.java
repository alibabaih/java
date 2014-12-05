package lesson_6_inheritance;

import lesson_7_interface.Colorful;

import java.util.ArrayList;

public class Graphic implements Colorful {

    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static ArrayList<Graphic> objects = new ArrayList<Graphic>();

    public Graphic(String color, ArrayList<Graphic> objects) {
        this.color = color;
        Graphic.objects.add(this);
    }

    //перебираем коллекцию
    public static void drawCollection() {
        for (Graphic object : objects) {
            object.draw();
        }
    }

    public void draw () {
        System.out.println(color);
    }

}
