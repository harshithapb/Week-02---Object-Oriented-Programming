package SingleInheritance;
import java.util.*;
public class Device {
    String deviceId;
    String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println(" id: " + deviceId + " status :" + status);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter no.of devices u want to create");
        int n = sc.nextInt();
        Device[] d = new Device[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter device  id for " + (i + 1));
            String id = sc.nextLine();
            System.out.println("Enter status:");
            String status = sc.nextLine();
            System.out.println("Enter  temperature Setting:");
            String temp = sc.nextLine();
            Thermostat dev = new Thermostat(id, status, temp);
            d[i] = dev;
        }
        System.out.println("Displaying info");
        for (int i = 0; i < n; i++) {
            d[i].displayStatus();
            d[i].displaySetting();


        }
    }
}
class Thermostat extends Device{
    String temperatureSetting;
    public Thermostat(String deviceId,String status,String temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }
    @Override
    void displaySetting(){

        super.displayStatus();
        System.out.println("Temp setting:"+temperatureSetting);
    }
}


