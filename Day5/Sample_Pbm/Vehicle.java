package Sample_Pbm;

public class Vehicle {
        private int maxSpeed;
        private String model;

        public Vehicle(int maxSpeed, String model) {
            this.maxSpeed = maxSpeed;
            this.model = model;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public String getModel() {
            return model;
        }

        public void displayVehicleInfo() {
            System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
        }

        @Override
        public String toString() {
            return "Vehicle{" +
                    "maxSpeed=" + maxSpeed +
                    ", model='" + model + '\'' +
                    '}';
        }
    }

    // Interface defining refuelable behavior
    interface Refuelable {
        void refuel();
    }

    // Subclass representing an electric vehicle
    class ElectricVehicle extends Vehicle {
        private double batteryCapacity; // in kWh

        public ElectricVehicle(int maxSpeed, String model, double batteryCapacity) {
            super(maxSpeed, model);
            this.batteryCapacity = batteryCapacity;
        }

        public double getBatteryCapacity() {
            return batteryCapacity;
        }

        public void charge() {
            System.out.println("Charging the " + getModel() + "'s battery.");
        }

        @Override
        public void displayVehicleInfo() {
            super.displayVehicleInfo();
            System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        }

        @Override
        public String toString() {
            return "ElectricVehicle{" +
                    "batteryCapacity=" + batteryCapacity +
                    "} " + super.toString();
        }
    }

    // Subclass representing a petrol vehicle
    class PetrolVehicle extends Vehicle implements Refuelable {
        private double fuelTankCapacity; // in liters

        public PetrolVehicle(int maxSpeed, String model, double fuelTankCapacity) {
            super(maxSpeed, model);
            this.fuelTankCapacity = fuelTankCapacity;
        }

        public double getFuelTankCapacity() {
            return fuelTankCapacity;
        }

        @Override
        public void refuel() {
            System.out.println("Refueling the " + getModel() + " with petrol.");
        }

        @Override
        public void displayVehicleInfo() {
            super.displayVehicleInfo();
            System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
        }

        @Override
        public String toString() {
            return "PetrolVehicle{" +
                    "fuelTankCapacity=" + fuelTankCapacity +
                    "} " + super.toString();
        }

        public static void main(String[] args) {
            // Create instances of ElectricVehicle and PetrolVehicle
            ElectricVehicle electricVehicle = new ElectricVehicle(150, "Tesla Model 3", 75);
            PetrolVehicle petrolVehicle = new PetrolVehicle(200, "Toyota Camry", 60);

            // Display information and perform actions
            electricVehicle.displayVehicleInfo();
            electricVehicle.charge();
            System.out.println(electricVehicle);

            petrolVehicle.displayVehicleInfo();
            petrolVehicle.refuel();
            System.out.println(petrolVehicle);
        }

    }




