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

    public void printPrioritized() {
        StringBuilder sb = new StringBuilder("Prioritized todo:\n-----------------\n");
        ArrayList<Integer> prio1list = new ArrayList<Integer>();
        ArrayList<Integer> prio2list = new ArrayList<Integer>();
        ArrayList<Integer> prio3list = new ArrayList<Integer>();
        ArrayList<Integer> prio4list = new ArrayList<Integer>();

        for (Task task : todoList) {

            if (task.getPrio() == 1) {
                prio1list.add(task.getTime());
            } else if (task.getPrio() == 2) {
                prio2list.add(task.getTime());
            } else if (task.getPrio() == 3) {
                prio3list.add(task.getTime());
            } else if (task.getPrio() == 4) {
                prio4list.add(task.getTime());
            }

        }

        Collections.sort(prio1list);
        Collections.sort(prio2list);
        Collections.sort(prio3list);
        Collections.sort(prio4list);

        for  (Integer time : prio1list) {
            for (Task task : todoList) {
                if (task.getTime() == time) {
                    sb.append(task.toString());
                    sb.append("\n");
                }
            }
        }

        for  (Integer time : prio2list) {
            for (Task task : todoList) {
                if (task.getTime() == time) {
                    sb.append(task.toString());
                    sb.append("\n");
                }
            }
        }

        for  (Integer time : prio3list) {
            for (Task task : todoList) {
                if (task.getTime() == time) {
                    sb.append(task.toString());
                    sb.append("\n");
                }
            }
        }

        for  (Integer time : prio4list) {
            for (Task task : todoList) {
                if (task.getTime() == time) {
                    sb.append(task.toString());
                    sb.append("\n");
                }
            }
        }
        sb.delete(sb.length()-1, sb.length());
        System.out.println(sb);


        //System.out.print("Prioritized todo:\n-----------------");




    }



}
