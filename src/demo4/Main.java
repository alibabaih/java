package demo4;
import java.util.Random;
/*
Синхронизация потоков
 */

class Data {
    int count =0;
    static int countSt =0;
}

class MyThread implements Runnable {

    private final Object synchron = new Object(); //ровно 1 объект с которым может работать много потоков
    Data obj;

    MyThread(Data d){
        obj = d;
        new Thread(this).start();
    }
    void Add(){
        try {
            synchronized(obj) {
                Thread.sleep(10);
                int n=obj.count;
                n++;
                Thread.sleep(10);
                obj.count=n;
            }
        } catch (InterruptedException ex) {       }
    }
    static synchronized void AddStatic() {
        try {
            Thread.sleep(10);
            int n=Data.countSt;
            n++;
            Thread.sleep(10);
            Data.countSt=n;
        } catch (InterruptedException ex) {       }
    }
    public void run() {
        for(int i=0; i<10; i++) Add();
        for(int i=0; i<10; i++) AddStatic();
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        Data d=new Data();
        MyThread t1=new MyThread(d);
        MyThread t2=new MyThread(d);

        Thread.sleep(1000);
        System.out.println(d.count);
        System.out.println(Data.countSt);    }

}
//lesson1 2:16
