package lessson_12_generics;

public class Main {

    public static void main(String[] args) {
        Wrapper<Integer> wrapper_1 = new Wrapper<Integer>(5);
        Wrapper<Double> wrapper_2 = new Wrapper<Double>(5.5);
        System.out.println(wrapper_1.getData());
        System.out.println(wrapper_2.getData());
    }

}
