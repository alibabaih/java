package demo6;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Data    d = new Data();
        Worker1 w1=new Worker1(1, d); //2 objects the same type
        Worker1 w2=new Worker1(2, d);

        w2.join();
        System.out.println("end of mian...");
    }

}
//3:37