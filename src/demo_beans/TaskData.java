package demo_beans;

import java.util.Calendar;
import java.util.EventObject;

/**
 * Created by l-vasil on 15.12.14.
 */
public class TaskData extends EventObject {
    private String name;
    private String date;

    public TaskData(Object source, String name) {
        super(source);
        this.name = name;

        Calendar c = Calendar.getInstance();
        date = c.toString();
    }

}
//1:27 lesson2
