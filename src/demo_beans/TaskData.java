package demo_beans;

import java.util.Calendar;
import java.util.EventObject;

public class TaskData extends EventObject {
    private String name;

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    private String date;

    public TaskData(Object source, String name) {
        super(source);
        this.name = name;

        Calendar c = Calendar.getInstance();
        date = c.toString();
    }

}
//1:27 lesson2
