package OOPS.abstraction.abstractkeyword;


abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
public class Example {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();

        Cat c = new Cat();
        c.sound();
    }
}
