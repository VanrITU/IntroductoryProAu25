import java.util.ArrayList;
import java.util.Comparator;

public class Todo {
    private ArrayList<Task> todoList = new ArrayList<Task>();
    private int totalTasksCom = 0;

    public void addTask(String description, int priority, int minutes) {

        if (priority<1 || priority>4) {
            System.out.println(description + " has invalid priority");

        } else if (minutes < 1){
            System.out.println(description + " has invalid workload");
        } else {
            Task newTask = new Task(description, priority, minutes);
            todoList.add(newTask);
        }

    }

    public void print(){
        System.out.println("Todo:\n-----");

        if (todoList.size() <= 0) {
            System.out.println("You're all done for today! #TodoZero");

        } else {

            for (Task task : todoList) {
                System.out.println(task.toString());
            }

        }
        if (totalTasksCom > 0) {
            System.out.println(totalTasksCom + " minutes of work done!");
        }
    }

    public void completeTask(int index) {
        if (index > (todoList.size()-1)||index <0) {
            System.out.println("Invalid index");
        } else {
            totalTasksCom += todoList.get(index).getTime();
            todoList.remove(index);

        }
    }


    public void printPriority(int limit) {
        System.out.println("Filtered todo:\n--------------");
        for (Task task : todoList) {
            if (task.getPrio()<= limit) {
                System.out.println(task.toString());
            } else {
                System.out.println("No tasks with given priority");
                break;
            }
        }
    }

    public void printPrioritized() {
        //StringBuilder sb = new StringBuilder("Prioritized todo:\n-----------------");

        /*for (Task task : todoList) {
            if (task.getPrio() == 1){
                if (task.getTime() == )
            }
        }*/

        System.out.print("Prioritized todo:\n-----------------");
        todoList.sort(new Comparator<Task>() {
            public int compare(Task t1, Task t2) {
                if (t1.getPrio() != t2.getPrio()) {
                    return Integer.compare((t1.getPrio()),(t2.getPrio()));
                } else {
                    return Integer.compare((t1.getTime()),(t2.getTime()));
                }
            }

        });



    }



}
