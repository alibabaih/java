package lesson_8_inner_classes;

public class Outer {

    private int data;

    public int getData() {
        /*
        //local class
        class Local {
            int z;
            public void show() {
                System.out.println(data);

            }
        }
        //этим локальным классом можно пользоваться только внутри этого метода
        //этот класс является частным случаем иннер класса
        Local local = new Local();
        local.show();
        */
        //анонимный класс
        (new Object() {
            int z;
            public void show() {
                System.out.println(data);
            }
        }).show(); //создали объет анонимного класса с методом show

        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Outer(int data) {

        this.data = data;
    }

    //nested class
    static class Nested {

        public void increment(Outer o) {
            o.data++; //nested class accessible for outer private var data
        }
    }
    //local case nested classes is an inner class
    class Inner {
        public void increment() {
            data++;
        }
    }
    //частным случаем иннер класса является локальный класс
    //отличается тем, что описание класса можно сделать внутри метода
    //см. в в методе getData Outer class

    //а частным случаем локального класса является анонимный класс
    //это локальный класс, у которого нет имени

}
