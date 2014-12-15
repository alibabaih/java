package demo_multithread.demo2;

public class MyThread2 implements Runnable {
	public Thread thread;
    public volatile boolean cancel = false;

	public MyThread2()
	{
		thread = new Thread(this);
	}

	@Override
	public void run() {

        try {
            double d = 1.5;

            for (int i = 0; i < 30; i++) {
                for(int j = 0; j < 1000000; j++) {
                    //по флагу omt.cancel = true; закрываем поток
                    if (cancel) {
                        throw new InterruptedException(); //выбрасывает исключение
                    }
                    d = d * d;
                }
                System.out.println("Name = " + Thread.currentThread().getName() +
                        ", i = " + i);
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
	}
}
