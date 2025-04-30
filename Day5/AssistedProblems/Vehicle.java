package AssistedProblems;
import java.util.*;
public class Vehicle {
    float maxSpeed;
    String fuelType;

    Vehicle(float maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }


    void displayInfo(){
        System.out.println(" Vehicle prototype \nvehicle fuel: "+fuelType+" max speed :"+maxSpeed);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter num of vehicles u want to create");
        int n=sc.nextInt();

        Vehicle[] veh=new Vehicle[n];
        System.out.println("Enter vehicles max Speed");
        float speed= sc.nextFloat();
        System.out.println("Enter vehicles fuel Type");
        sc.nextLine();
        String fuel=sc.nextLine();
        Vehicle vehicle=new Vehicle(speed,fuel);
        veh[0]=vehicle;

        System.out.println("Enter car max Speed");
        float carSpeed= sc.nextFloat();
        System.out.println("Enter car fuel Type");
        sc.nextLine();
        String carFuel=sc.nextLine();
        System.out.println("Enter cars seat capacity");
        int seat= sc.nextInt();;
        Car car=new Car(carSpeed,carFuel,seat);
        veh[1]=car;


        System.out.println("Enter Truck max Speed");
        float truckSpeed= sc.nextFloat();
        System.out.println("Enter Truck fuel Type");
        sc.nextLine();
        String truckFuel=sc.nextLine();
        System.out.println("Enter Trucks state name");
        String state= sc.nextLine();;
        Truck truck=new Truck(truckSpeed,truckFuel,state);
        veh[2]=truck;


        System.out.println("Enter Motorcycle max Speed");
        float  cycleSpeed= sc.nextFloat();
        System.out.println("Enter Motorcycle fuel Type");
        sc.nextLine();
        String  cycleFuel=sc.nextLine();
        System.out.println("Enter company name");
        String company= sc.nextLine();;
        Motorcycle cycle=new Motorcycle(cycleSpeed,cycleFuel,company);
        veh[3]=cycle;

        System.out.println(" Displaying info");

        for(int i=0;i<n;i++){
            veh[i].displayInfo();
            System.out.println();
        }

    }
}
class Car extends Vehicle{
    int seatCapacity;
    Car(float maxSpeed,String fuelType,int seatCapacity ){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }
    @Override
    void displayInfo(){
        System.out.println(" Car \n vehicle fuel: "+fuelType+" max speed :"+maxSpeed +" seat capacity:"+seatCapacity);
    }

}
class Truck extends Vehicle{
    String stateName;
    Truck(float maxSpeed,String fuelType,String stateName){
        super(maxSpeed,fuelType);
        this.stateName=stateName;
    }
    @Override
    void displayInfo(){
        System.out.println(" Truck \nvehicle fuel: "+fuelType+" max speed :"+maxSpeed +" State Name:"+stateName);
    }

}

class Motorcycle extends Vehicle{
    String company;
    Motorcycle(float maxSpeed,String fuelType,String company){
        super(maxSpeed,fuelType);
        this.company=company;
    }
    @Override
    void displayInfo(){
        System.out.println(" Motorcycle \nvehicle fuel: "+fuelType+" max speed :"+maxSpeed +" company:"+company);
    }



}
