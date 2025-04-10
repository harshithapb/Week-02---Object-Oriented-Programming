package Level3;

import java.util.Scanner;

public class Student {
    int rollNumber;
   protected String name;
   private  float CGPA;

   //setter method for accessing private var
    public void setCGPA(float CGPA){
         this.CGPA=CGPA;
    }
    //getter method for returning the private var
    public float getCGPA(){
        return this.CGPA;
    }
    //setter method for accessing protected var
    public void setName(String name){
        this.name=name;
    }
    //getter method for returning the protected var
    public String getName(){
        return this.name;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student student=new Student();
        System.out.println("Enter the roll no. of student");
        student.rollNumber=sc.nextInt();
        //Getting i/p for protected var name
        sc.nextLine();
        System.out.println("Enter the name of student");
        student.setName(sc.nextLine());
        //setter method
        System.out.println("Enter the CGPA of your sem");
        float cgpa=sc.nextFloat();
        student.setCGPA(cgpa);// getter method
        System.out.println("The student " +student.getName() +", roll no. "+ student.rollNumber+"  has  CGPA of :"+student.getCGPA());
        System.out.println("Displaying the use of PostgraduateStudent subclass ");
        PostgraduateStudent pg=new PostgraduateStudent();
        System.out.println("Enter name of PostGraduate Student: ");
        sc.nextLine();
        pg.setName(sc.nextLine());
        System.out.println("PG Student name entered is :"+pg.getName());
    }
}
class PostgraduateStudent extends Student{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //protected member accessing

    }
}


