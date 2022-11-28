public abstract class Employee
{
    // Declaring variables for Employee class
    private int employeeID;
    private String firstName;
    private String lastName;
    private String gender;
    private int salary;

    // Constructor function for Employee class
    public void Employee(int employeeID, String firstName, String lastName, String gender, int salary)
    {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.salary = salary;
    }

    // Getter function for employeeID integer
    public int getEmployeeID()
    {
        return employeeID;
    }

    // Getter function for firstName string
    public String getFirstName()
    {
        return firstName;
    }

    // Getter function for lastName string
    public String getLastName()
    {
        return lastName;
    }

    // Getter function for gender string
    public String getGender()
    {
        return gender;
    }

    // Getter function for salary long integer
    public long getSalary()
    {
        return salary;
    }

    // Setter function for salary long integer
    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int payRise(int salary, int increase)
    {
        return (salary + increase);
    }

    public int payRise(int salary, float proportion)
    {
        return Math.round(salary * proportion);
    }



}
