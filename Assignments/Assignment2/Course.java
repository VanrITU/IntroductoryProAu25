public class Course //creating class
{
    // Class attributes
    private String courseName; //fields
    private int enrollments;

    //class constructor
    // you set initial values here ect.
    public Course(String courseName, int enrollments)
    {
        this.courseName = courseName;
        this.enrollments = enrollments;
    }

    public String getName()
    {
        return courseName();
    }

    public int getEnrollments()
    {
        return enrollments;
    }

    public String toString()
    {
        return "The name of the course is " + courseName + " and there are " + enrollments + " students enrolled in the course";
    }

    public void setName(String Name)
    {
        this.courseName = Name;
    }

    public void setEnrollments(int enrollments)
    {
        if (enrollments < 0){
            System.out.println("The number of enrolled students cannot be negative!");
        } else if (enrollments > 300) {
            System.out.println("The number of enrolled students cannot be greater than 300!");
        } else {
            this.enrollments = enrollments;
        }

    }

    /* ex. of main class
    public stati void main (String[] args) {
        Main myObj = new Main(); //creating an object of class Main
        }
     */


}