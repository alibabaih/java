package demo_multithread.demo1;

public class MyThread1 extends Thread {

@Override
	public void run()
	{
	for (int i = 0; i < 300; i++)
        //смотрим на исключения в потоке

		System.out.println("Name = " + Thread.currentThread().getName() +
				", i = " + i);
	}

}
