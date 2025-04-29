package Level2;
import java.util.*;
public class Product {
    String productName;
    float price;
    static int totalProducts;

    Product(String productName, float price){
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }
    void displayProductDetails(){
        System.out.println("Product name: "+productName);
        System.out.println(" price :"+price);
    }
    //static -> for declaring class methods
    static void displayTotalProducts(){
        System.out.println("Total Products "+totalProducts);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ch=-1;
        do{
            System.out.println("Enter 1 to create new product , 2 to view total products count  and 0to exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter prod name:");
                    String prod=sc.next();
                    System.out.println("Enter prod price:");
                    float p=sc.nextFloat();
                    sc.nextLine();
                    Product pi=new Product(prod,p);
                    pi.displayProductDetails();
                    System.out.println();
                    break;
                case 2:
                    Product.displayTotalProducts();
                    break;
                default:
                    if(ch==0){
                        System.out.println("Exiting");
                    }
                    else{
                        System.out.println("Invalid choice");
                    }
            }
        }while(ch!=0);
    }
}
