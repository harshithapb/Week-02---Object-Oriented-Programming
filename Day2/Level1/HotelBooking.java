package Level1;

import java.util.*;
public class HotelBooking {
    String  guestName;
    String roomType;
    int nights;
    // Default Constructor -> booking done when nothing mentioned
    HotelBooking(){
        guestName=" Guest Mode ";
        roomType=" Two BEDROOM";
        nights=1;
    }
    //Parmeterized
    HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    // Copy using another Constructor
    HotelBooking( HotelBooking h){
        guestName=h.guestName;
        roomType=h.roomType;
        nights=h.nights;
    }
    void display(){
        System.out.println(" Guest Name: "+guestName+" , Room Type : "+roomType+" , Number of nights : "+nights);
    }
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice=0;
        HotelBooking prevBooking=null;
       do{
           System.out.println("Enter 1 for booking.");
           System.out.println("Enter 2 for  copying previous booking.");
           System.out.println("Enter 3 for  default booking.");
           System.out.println("Enter 4 to exit booking.");
           choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter guestName:");
                    String g=sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter Room type:");
                    String r=sc.nextLine();
                    System.out.println(" Enter number of nights:");
                    int n=sc.nextInt();
                    HotelBooking h= new HotelBooking(g,r,n);
                    h.display();
                    prevBooking=h;
                    break;
                case 2:
                    if(prevBooking!=null){
                        HotelBooking h1=new HotelBooking(prevBooking);
                        h1.display();
                    }
                    else{
                        System.out.println("No prev booking.Switching to default booking");
                        HotelBooking hDefault=new HotelBooking();
                        hDefault.display();
                    }
                case 3:
                    HotelBooking hDefault=new HotelBooking();
                    hDefault.display();
                    break;
                default:
                    if(choice==4){
                        System.out.println("Exiting");
                    }
                    else{
                        System.out.println("Invalid choice");
                    }

            }
       }while(choice!=4);
    }
}
