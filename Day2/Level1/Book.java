package Level1;

import java.util.*;
public class Book {
    String title;
    String author;
    float price;
    //Default Constructor
    Book(){

    }


    Book(String title, String author,float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display(){
        System.out.println("Title name:"+ title+" Author name: "+author+" Price :"+Math.round(price*100.0)/100.0);
    }
    public static void main(String[] args){
        Book bookDefault=new Book();
        System.out.println(" Default values are:");
        bookDefault.display();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the title of  Level1.Book");
        String t=sc.nextLine();
        System.out.println("Enter the name of  Author");
        String n=sc.nextLine();
        System.out.println("Enter the price of  Level1.Book");
        float p=sc.nextFloat();
        Book bookParameterized=new Book(t,n,p);
        bookParameterized.display();


    }



    }


