
class Person {
    String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Doctor extends Person {
    int doctorId;
    String specialization;
}

class Surgeon extends Doctor {
    String operationType;

    void performSurgery() {
        System.out.println("Operation Type: " + operationType);
        System.out.println("Surgery is being performed.");
    }
}

public class HospitalManagement {
    public static void main(String[] args) {

        Surgeon s = new Surgeon();

        s.name = "Rahul";
        s.age = 35;
        s.doctorId = 101;
        s.specialization = "Cardiology";
        s.operationType = "Heart Surgery";

        s.displayDetails();

        System.out.println("Doctor ID: " + s.doctorId);
        System.out.println("Specialization: " + s.specialization);

        s.performSurgery();
    }
}
