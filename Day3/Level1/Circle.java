package Level1;

import java.util.*;
public class Circle {
    float radius;
    //Default
    Circle(){

    }
    //Parameterized
    Circle(float radius){
        this.radius=radius;
    }
    void display(){
        System.out.println("Radius of circle is:"+radius);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Default val:");
        Circle circleDefault =new Circle();
        circleDefault.display();
        System.out.println("Enter the value of radius ");
        float rad=sc.nextFloat();
        Circle circle2=new Circle(rad);
        circle2.display();

    }
}
