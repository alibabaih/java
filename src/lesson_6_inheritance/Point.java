package lesson_6_inheritance;

public class Point extends Graphic {

    public int x;
    public int y;

    public Point(String color, int x, int y) {
        super(color, objects);
        this.x = x;
        this.y = y;
    }

    public void movePoint(int a, int b) {
        x = x + a;
        y = y + b;
    }

    @Override
    public void draw() {
        System.out.println(color);
        System.out.println(x);
        System.out.println(y);
    }

    public void showPoint() {
        System.out.println(color);
        System.out.println(x);
        System.out.println(y);
    }
}
