package lesson_8_homework_loose_coupling_of_components;

public class Lamp implements Electricity {

    @Override
    public void electricityOn() {
        System.out.println("Лампа зажглась");
    }
}
