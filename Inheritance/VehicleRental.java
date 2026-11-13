class Vehicle{
    String brand;
    String model;

    void start(){
        System.out.println("Vehicle Brand: "+brand);
        System.out.println("Vehicle Model: "+model);
    }
}

class Car extends Vehicle{
    int numberOfDoors;

    
}

class Bike extends Vehicle{
    int engineCC;

}
public class VehicleRental {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Maruthi";
        c.model = "Celerio";
        c.numberOfDoors = 4;
        c.start();
        System.out.println("No. of doors: "+c.numberOfDoors);

        System.out.println();
        
        Bike b = new Bike();
        b.brand = "Royal Enfield";
        b.model="Classic 350";
        b.engineCC = 350;
        b.start();
        System.out.println("Engine CC: "+b.engineCC);
    }
}
