import java.util.*;
public class Company {
    private Set<Employee> allEmployees;

    public Company() {
        this.allEmployees = new HashSet<>(); //remember hashset
    }

    public void addEmployee(Employee emp, int salary) {
        emp.setSalary(salary);
        this.allEmployees.add(emp);
    }

    public Employee findLeastBusy(int depId) {

    }

    public void assignTask(String task, int depId) {

    }

    public String raiseSalary(int percentage) {

    }
}


/*
Q2
a) Y
b) Y

Q3
a) No a class cannot extend multiple classes
d) Y

Q4
c) Y

Q5
a) Yes all consructors must start with a call of the super
d) Yes it is a subclass of super

Q6  Interface
a) Yes same amount of methods
b) Yes no double names

Q7 Y
c)

Q8
a) No it is e)
c) Y
d) Y

Q9
b) Y
d) Y

Q10
c) No it is a String and not a void

Q11
c) Y
d) No its not a primitive char is primitive
f) Y

Q12
b) Y

Q13
answer is b) 5 because it can run 5 times before hitting 0 and it is an int and not a float

Q14
?
it is 41.9  b) becuase the others gets removed

Q15
a) Y length is 4

c) is altsp true
apparently the string calls the other?

Q16
a) No it is d) 9,9,9
Thats how it works







 */