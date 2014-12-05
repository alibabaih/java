package lesson_6_inheritance;

public class Main {

    public static void main(String[] args) {

        Point point_1 = new Point("red", 4, 5);
        Circle circle_1 = new Circle("blue", 14);
        /*
        point_1.showPoint();
        point_1.movePoint(30, 12);
        point_1.showPoint();
        circle_1.draw();
        */
        Graphic.drawCollection();
    }

}
