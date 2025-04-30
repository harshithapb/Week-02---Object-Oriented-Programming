package AssistedProblems;

public class Employee {
    String name;
    int id;
    float salary;

    Employee(String name,int id,float salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
        System.out.print("Employee ->");
    }

    void displayDetails(){
        System.out.println(" Name :"+name
        + " id :"+id+" salary "+salary);
    }

    public static void main(String[] args){
        Employee emp=new Employee("Sita",101,(float)10000.35);
        emp.displayDetails();
        Manager manager =new Manager("Geetha",201,(float)234.99,12);
        manager.displayDetails();

        Developer dev=new Developer("Mohini",221,(float)1000.35,"frontend");
        dev.displayDetails();

        Intern intern=new Intern("Sharma",222,(float)200.22,"Backend");
        intern.displayDetails();
    }


}
class Manager extends Employee{
    int teamSize;
    Manager(String name,int id,float salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
        System.out.println("Manager");
    }
    @Override
    void displayDetails(){
        System.out.println(" Name :"+name
                + " id :"+id+" salary "+salary+" Team size:"+teamSize);
    }

}
class Developer extends Employee{
    String pgmLang;
    Developer(String name,int id,float salary,String pgmLang){
        super(name,id,salary);
        this.pgmLang=pgmLang;
        System.out.println("Developer");

    }
    @Override
    void displayDetails(){
        System.out.println(" Name :"+name
                + " id :"+id+" salary "+salary+" programming Language:"+pgmLang);
    }

}
class Intern extends Employee{
    String dept;
    Intern(String name,int id,float salary,String dept){
        super(name,id,salary);
        this.dept=dept;
        System.out.println("Intern");
    }
    @Override
    void displayDetails(){
        System.out.println(" Name :"+name
                + " id :"+id+" salary "+salary+" Dept currently working in:"+dept);
    }

}
