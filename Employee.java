/** Create an Employee class that extends the
 *  Person class.  An employee has a jobTitle,
 *  and a salary.
 */

public class Employee extends Person

private String jobTitle;
private int salary;

public Employee(String iname, int iage, String ijobTitle, int isalary)
{
    super(iname, iage);
    jobTitle = ijobTitle;
    salary = isalary;
}

public Employee(String ijobTitle, int isalary)
{
    super("John Doe", 0);
    jobTitle = ijobTitle;
    salary = isalary;
}

public Employee()
{
    super("John Doe", 0);
    jobTitle = "Unemployed";
    salary = 0;
}

public getjobTitle()
{
    return jobTitle;
}

public setjobTitle(ijobTitle)
{
    jobTitle = ijobTitle;
}

