package exceptionHandling.creatingexception.voterId;

public class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void disp(){
        System.out.println("age: "+age);
        System.out.println("name: "+name);
    }
    void checkEli(int age) throws VoterIDException{
        if(age >= 18){
            System.out.println("Eligible for Voter ID");
        } else {
            throw new VoterIDException("Not Eligible for Voter ID");
        }
    }
}
