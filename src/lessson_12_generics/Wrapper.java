package lessson_12_generics;

public class Wrapper<MyType> {

    private MyType data;

    public MyType getData() {
        return data;
    }

    public Wrapper(MyType data) {

        this.data = data;
    }
}
