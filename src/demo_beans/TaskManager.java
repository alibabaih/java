package demo_beans;

import java.util.ArrayList;
import java.util.Random;

public class TaskManager {

    //collection
    private ArrayList<TaskListener> list = new ArrayList<TaskListener>();

    public void works () throws InterruptedException {
        Random random = new Random();
        Thread.sleep(random.nextInt(2000));
        fireTask(1, "");

        Thread.sleep(random.nextInt(2000));
        fireTask(2, "");
    }

    public synchronized void addTaskListener(TaskListener listener) {
        list.add(listener);
    }
    public synchronized void removeTaskListener(TaskListener listener) {
        list.remove(listener);
    }

    private void fireTask(int eventId, String name) {
        //make copy of the collection
        ArrayList<TaskListener> copy;

        synchronized (this) {
            copy = (ArrayList<TaskListener>) list.clone();
        }
        for (TaskListener listener : copy) {
            //send some event

            TaskData ev = new TaskData(this, name)
            if (eventId == 1) {
                listener.start(ev);
            } else {
                listener.stop(ev);
            }
        }
    }
}
