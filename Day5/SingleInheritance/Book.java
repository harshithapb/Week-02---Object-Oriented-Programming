package SingleInheritance;
import java.util.*;
public class Book {
    String title;
    int publicationYear;

    Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    void  displayInfo(){
        System.out.println("Book title:"+title+" publication year :"+publicationYear);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of books u want ");
        int n=sc.nextInt();
        Author[] authors=new Author[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("\nEnter title of book"+(i+1));
            String title= sc.nextLine();
            System.out.println("Enter publication yr:");
            int yr=sc.nextInt();
            System.out.println("Enter Author name:");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enter bio of author:");
            String bio=sc.nextLine();
            Author a=new Author(title,yr,name,bio);
            authors[i]=a;
        }
        System.out.println("Displaying info");
        for(int i=0;i<n;i++){
            authors[i].displayInfo();
            authors[i].authorInfoDisplay();
        }
    }
}
class Author extends Book{
    String name;
    String bio;
    Author(String title,int publicationYear,String name,String bio){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }

    void authorInfoDisplay(){
        System.out.println("Author name:"+name+" bio: "+bio);
    }

}
