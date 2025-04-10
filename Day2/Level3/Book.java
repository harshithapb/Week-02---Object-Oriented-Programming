package Level3;
import java.util.*;
public class Book {
    String ISBN;
    protected String title;
    private String author;

    //setter for private
    public void setAuthor(String author){
        this.author=author;
    }
    //getter for private
    public String getAuthor(){
        return this.author;
    }
    //setter for protected
    public void setTitle(String title){
        this.title=title;
    }
    //getter for protected
    public String getTitle(){
        return this.title;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Book book=new Book();
        System.out.println("Enter the author Name:");
        book.setAuthor(sc.nextLine());
        System.out.println("Enter the ISBN:");
       // sc.nextLine();
        book.ISBN=sc.nextLine();
        System.out.println("Using subclass Ebook");
        EBook eb=new EBook();
        System.out.println("Enter the title:");
        eb.setTitle(sc.nextLine());
        System.out.println("Author name is: "+book.getAuthor());
        System.out.println("Title of book is "+eb.getTitle());
        System.out.println("The ISBN is :"+ book.ISBN);

    }
}
class EBook extends Book{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        EBook eb=new EBook();
    }
}
