package Level1;

import java.util.*;
public class LibraryBook {
    String title;
    String author;
    float price;
    boolean availability;

    LibraryBook(String title, String author, float price,boolean availability){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;
    }
    void borrowBook(String title){
        if(availability){
            System.out.println("Book  titled "+title +" by author "+author+" is borrowed.");
            availability=false;
        }
        else{
            System.out.println("Cannot borrow");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        ArrayList<LibraryBook> lib=new ArrayList<>();
        lib.add(new LibraryBook("HP1 ","JKR",435,true));
        lib.add(new LibraryBook("HP2","JKR",546,true));
        lib.add(new LibraryBook("HP3 ","JKR",6666,true));
        lib.add(new LibraryBook("HP4 ","JKR",6577,true));

        do{
            System.out.println("Enter 1 to view list of books , 2 to to borrow books and 0 to exit system.");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Available books are:");
                    boolean availableFound=false;
                    for(LibraryBook book:lib){
                        if(book.availability)
                        {
                            System.out.println(book.title +" by "+book.author+"  is available at cost:"+book.price);
                            availableFound=true;
                        }
                    }
                    if(!availableFound){
                        System.out.println("Not available");
                    }
                    break;
                case 2:
                    System.out.print("Enter the title of the book you want to borrow: ");
                    String borrowTitle = sc.next();
                    boolean found = false;
                    for (LibraryBook book : lib) {
                        if (book.title.trim().equalsIgnoreCase(borrowTitle.trim())) {
                            book.borrowBook(borrowTitle);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book with title \"" + borrowTitle + "\" not found in the library.");
                    }
                    break;
                default:
                    if(choice==0){
                        System.out.println("Exiting lib system");
                    }
                    else{
                        System.out.println("Invalid choice");
                    }


            }

        }while(choice!=0);

    }
}
