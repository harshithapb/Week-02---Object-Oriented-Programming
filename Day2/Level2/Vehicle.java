package Level2;
import java.util.*;
public class Vehicle {
    String ownerName;
    String vehicleType;
    static float registrationFee;
    static void updateRegistrationFee(float newFee){
        registrationFee=newFee;
        System.out.println("New Registration Fee is"+registrationFee);
    }
    Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    void displayVehicleDetails(){
        System.out.println("The Vehicle owner name is:"+ownerName);
        System.out.println("The Vehicle Type is:"+vehicleType);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of owner");
        String name=sc.nextLine();
        //sc.nextLine();
        System.out.println("Enter the vehicle type");
        String type=sc.nextLine();
        Vehicle vehicle=new Vehicle(name,type);
        vehicle.displayVehicleDetails();
        System.out.println("Enter the New Registration Fee for all vehicles");
        float fee=sc.nextFloat();
        updateRegistrationFee(fee);
    }
}
