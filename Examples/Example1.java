package Examples;

class Parking{
    String vehicleNo;

    //constructor
    Parking(String vehicleNo){
        this.vehicleNo = vehicleNo;
    }

    //method overloading 
    void calculateCharges(int hours){
        System.out.println("Total Hours");
    }

    void calculateCharges(int hours, int days){
        System.out.println("Hours, Days");
    }
}

    //child classes
    class CarParking extends Parking{
        CarParking(String vehicleNo){
        super(vehicleNo);
        System.out.println("Car vehicle no: "+vehicleNo);
        }
        @Override
        void calculateCharges(int hours){
            System.out.println("Car-Parking Hours");
        }
    }
    class BikeParking extends Parking{
        BikeParking(String vehicleNo){
        super(vehicleNo);
        System.out.println("Bike Parking no:" +vehicleNo);
        }
        @Override 
        void calculateCharges(int hours){
            System.out.println("Bike-Parking hours");
        }
    }
    class TruckParking extends Parking{
        TruckParking(String vehicleNo){
            super(vehicleNo);
            System.out.println("Truck-parking no:" +vehicleNo);
        }
        @Override 
        void calculateCharges(int hours){
            System.out.println("Truck-Parking hours");
        }
    }

public class Example1 {
    public static void main(String[] args) {
        CarParking car = new CarParking("KA02MJ5836");
        BikeParking bike = new BikeParking("KA02CD0567");
        TruckParking truck = new TruckParking("KA044569");
        car.calculateCharges(12);
        bike.calculateCharges(34);
        truck.calculateCharges(45);

        Parking p = new Parking("KA02MH3452");
        p.calculateCharges(2);
        p.calculateCharges(2,45);
    }
}

