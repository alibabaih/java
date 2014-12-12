package demo6;

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
        for (int i = 0; i < 5; i++) {
            if (id == 1) {
                data.Tic();
            } else {
                data.Tak();
            }
        }
    }
}
