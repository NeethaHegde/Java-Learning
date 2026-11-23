package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product{
    String name;
    int price;
    
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    void display(){
        System.out.println("Name: "+name +" "+ "Price: "+price);
    }
}
//sort by name 
class Productname implements Comparator<Product>{
    @Override 
    public int compare(Product o1, Product o2){
        return o1.name.compareTo(o2.name);
    }
}

//sort by price
class Productprice implements  Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2){
        return Integer.compare(o1.price, o2.price);
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Product> p1 = new ArrayList<>();
        p1.add(new Product("Laptop", 50000));
        p1.add(new Product("Keyboard", 3000));
        p1.add(new Product("Mouse", 1000));
        p1.add(new Product("CPU", 2000));

        //sort by name
        Collections.sort(p1, new Productname());
        System.out.println("sorted by name");
        for(Product a: p1){
            a.display();
        }

        //sort by price
        Collections.sort(p1, new Productprice());
        System.out.println("sorted by price");
        for(Product a: p1){
            a.display();
        }

    }
}
