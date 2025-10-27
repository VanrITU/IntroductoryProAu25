import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int departmentId;
    private int salary;
    private List<String> assignedTasks;
    private int totalProcessed;


    public Employee(String name, int salary, int departmentId) {
        this.totalProcessed = 0;
        this.assignedTasks = new ArrayList<>();
    }

    public int getTotalProcessed() {
        return this.totalProcessed;
    }

    public int getDepartmentId() {
        return this.departmentId;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getAssignedTasksNum() {
        return assignedTasks.size();
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }

    public void processTask() {

        if (!this.assignedTasks.get(0).isEmpty()) {
            System.out.print("processing task " + this.assignedTasks.get(0));
            this.assignedTasks.remove(0);
            this.totalProcessed += 1;
        } else {
            System.out.print("no tasks to process");
        }

    }

    public String toString(){
        return "name: " + this.name + ", department Id: " + this.departmentId + ", salary: " + this.salary;
    }

    public void addTask(String newTask) {
        this.assignedTasks.add(newTask);
    }

}
