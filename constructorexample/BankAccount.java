package constructorexample;

class Person{
    int balance ;
    String name;

    Person(int balance, String name){
        this.balance = balance;
        this.name = name;
        System.out.println("Balance: "+ balance);
        System.out.println("Name: "+name);
    }

}
public class BankAccount {

    public static void main(String[] args) {
    

        Person p2 = new Person(20000, "Neetha");
        System.out.println();
        Person p3 = new Person(50000,"Neetha");
        



    }
    
}
