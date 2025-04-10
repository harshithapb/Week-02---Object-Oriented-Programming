package Level1;

import java.util.*;
public class Person  implements Cloneable{
    String name;
    int age;
    float salary;
    Person(String name, int age, float salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    void display(){
        System.out.println("Level1.Person name : "+name +" Level1.Person age : "+age+"  Level1.Person salary "+salary);
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the person 1 NAME:");
            String n=sc.nextLine();
            System.out.println("Enter the person 1 AGE:");
            int a=sc.nextInt();
            System.out.println("Enter the person 1 SALARY:");
            float s=sc.nextFloat();
            Person p1=new Person(n,a,s);
            Person p2=(Person)p1.clone();
            System.out.println("Level1.Person 1 details:");
            p1.display();
            System.out.println("Level1.Person 2 details which are cloned from person 1:");
            p2.display();
        }
        catch(CloneNotSupportedException c){

        }
    }
}
