package OOPS.abstraction.coupling;

class Vehicle{
    void run(){
        System.out.println("Runs on vehicle");
    }
}

//Tight coupling
class Car{
    void run(){
        Vehicle v = new Vehicle();
        v.run();
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
    }
}
