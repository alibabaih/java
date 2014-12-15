package demo_multithread.demo2;

public class MyThread1 extends Thread {

@Override
	public void run()
	{
	for (int i = 0; i < 30; i++)
        //смотрим на исключения в потоке

		System.out.println("Name = " + Thread.currentThread().getName() +
				", i = " + i);
	}

}
