package Level1;
import java.util.*;
public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(){
        customerName="Demo Cust";
        carModel="Basic";
        rentalDays=1;
    }
    float calcCost(int rentalDays){
        return  (float)((float)rentalDays*45.15);

    }
    void display(float cost){
        System.out.println("Car Model"+carModel+ " rented by customer :"+customerName+" for "+rentalDays+" days");
        System.out.println("Cost is "+cost);
    }

    CarRental(String customerName,String carModel,int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            System.out.println("Enter 1 for booking default choice as guest , 2 for your choice and 0 to exit");
            ch=sc.nextInt();
            switch(ch) {
                case 1:
                    CarRental cr = new CarRental();
                    cr.display(cr.calcCost(1));
                    break;
                case 2:
                    System.out.println("Enter cust name:");
                    String cName = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter car model:");
                    String carName = sc.nextLine();
                    System.out.println("Enter number of days to be rented:");
                    int n = sc.nextInt();
                    CarRental car = new CarRental(cName, carName, n);
                    car.display(car.calcCost(n));
                    break;
                default:
                    if (ch == 0) {
                        System.out.println("Exiting sys");
                    } else {
                        System.out.println("Inavalid choice");
                    }
            }
        }while(ch!=0);
    }

}
