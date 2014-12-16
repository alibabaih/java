package demo_beans;

public class Main {

    //Java Beans — standard of the component structure
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Client client_1 = new Client("Delete all");
        Client client_2 = new Client("Delete all");
        Client client_3 = new Client("Delete all");
        taskManager.addTaskListener(client_1);
        taskManager.addTaskListener(client_2);
        taskManager.addTaskListener(client_3);

        taskManager.works();



        taskManager.removeTaskListener(client_1);
        taskManager.removeTaskListener(client_2);
        taskManager.removeTaskListener(client_3);
    }

}

2:07