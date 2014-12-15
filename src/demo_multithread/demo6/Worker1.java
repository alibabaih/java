package demo_multithread.demo6;

public class Worker1 extends Thread {

    private int id;
    private Data data;

    public Worker1(int id, Data data) {
        this.id = id;
        this.data = data;
        this.start(); //на этом объекте стартуем его как отдельный поток
    }

    @Override
    public void run() {
        //super.run();
        synchronized (data) {
            for (int i = 0; i < 5; i++) {
                if (id == 1 && id == data.getState()) {
                    data.Tic();
                    notify();
                } else if (id == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } if (id == 2 && id == data.getState()) {
                    data.Tak();
                    notify();
                } else if (id == 2) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
