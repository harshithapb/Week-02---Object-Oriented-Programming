package Hybrid_Inheritance;

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

// Interface defining worker behavior
interface Worker {
    void performDuties();
}

// Subclass representing a chef
class Chef extends Person implements Worker {
    private String specialization;

    public Chef(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is cooking " + specialization + ".");
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Specialization: " + specialization);
    }

    @Override
    public String toString() {
        return "Chef{" +
                "specialization='" + specialization + '\'' +
                "} " + super.toString();
    }
}

// Subclass representing a waiter
class Waiter extends Person implements Worker {
    private int tablesServed;

    public Waiter(String name, int id, int tablesServed) {
        super(name, id);
        this.tablesServed = tablesServed;
    }

    public int getTablesServed() {
        return tablesServed;
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is serving food at " + tablesServed + " tables.");
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Serving " + tablesServed + " tables.");
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "tablesServed=" + tablesServed +
                "} " + super.toString();
    }
}

// Main class to demonstrate the hybrid inheritance
public class Main { // Added a Main class to hold the main method
    public static void main(String[] args) {
        // Create instances of Chef and Waiter
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("John Smith", 201, 5);

        // Display information and perform duties
        chef.displayPersonInfo();
        chef.performDuties();
        System.out.println(chef);

        waiter.displayPersonInfo();
        waiter.performDuties();
        System.out.println(waiter);
    }
}
