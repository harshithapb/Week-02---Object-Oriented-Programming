package Level3;
import java.util.*;
public class Employee {
    int employeeID=1;
    protected String department = "ABC1";
    private float salary =  1000.0f;

    public String getDept() {
        return this.department;
    }

    public void setSalary(float sal) {
        this.salary = sal;
    }

    public float getSalary() {
        return this.salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("The  old salary is :" + emp.getSalary());
        System.out.println("Enter the new value of Salary ");
        emp.setSalary(sc.nextFloat());
        System.out.println(" Using subclass Manager");
        Manager m=new Manager();
        System.out.println(" The emp id is :"+emp.employeeID);
        System.out.println(" Dept is "+emp.getDept());
        System.out.println("Updated salary is Rs."+emp.getSalary());
    }
}
class Manager extends Employee{

}
