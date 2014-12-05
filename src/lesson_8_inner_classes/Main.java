package lesson_8_inner_classes;

public class Main {

    public static void main(String[] args) {
        System.out.println("test");

        Outer outer = new Outer(5);
        System.out.println(outer.getData());

        //instance of the nested class
        Outer.Nested nested = new Outer.Nested();

        //instance of the inner class
        //иннер класс ориентируется на объект аутер класса
        //2 объекта иннер привязаны к 1 объекту аутер класса
        Outer.Inner inner_1 = outer.new Inner();
        Outer.Inner inner_2 = outer.new Inner();
        inner_1.increment();
        inner_2.increment();
        System.out.println(outer.getData());
        System.out.println(inner_2);
        inner_2.increment();
        System.out.println(inner_2);
    }

}
