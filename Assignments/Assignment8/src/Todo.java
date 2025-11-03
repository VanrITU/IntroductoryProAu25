import java.util.ArrayList;
import java.util.Collections;

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

        // hvis der ikk er en task med den prio skal den skrive det der
        boolean isIn = false;


        for (Task task : todoList) {
            if (limit == task.getPrio()) {
                isIn = true;

            }

        }
        for (Task task : todoList) {
            if (isIn == false) {
                System.out.println("No tasks with given priority");

            } else {
                if (task.getPrio()<= limit) {
                    System.out.println(task.toString());
                }
            }
        }


    }

    public StringBuilder Prioritized(int prio) {
        ArrayList<Integer> prioList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (Task task : todoList) {

            if (task.getPrio() == prio) {
                prioList.add(task.getTime());
            }

        }
        Collections.sort(prioList);

        for  (Integer time : prioList) {
            for (Task task : todoList) {
                if (task.getTime() == time) {
                    sb.append(task.toString());
                    sb.append("\n");
                }
            }
        }

        return sb;

    }

    public void printPrioritized() {
        System.out.print("Prioritized todo:\n-----------------\n");
        StringBuilder sb = new StringBuilder();
        //int[] prioIndex = new int[3];

        for (int i=0; i < 5; i++) {
            sb.append(Prioritized(i+1));
        }

        System.out.print(sb);


    }



}
