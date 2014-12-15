package demo_beans;

import java.util.EventListener;

public interface TaskListener extends EventListener {

    public void start(TaskData event);
    public void stop(TaskData event);

}
