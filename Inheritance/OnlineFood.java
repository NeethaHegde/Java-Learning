class Food {
    String foodName;
    double price;

    void displayFood() {
        System.out.println("Food Name: " + foodName);
        System.out.println("Price: " + price);
    }
}

class Pizza extends Food {
    String size;

    double calculatePrice() {
        if (size.equalsIgnoreCase("Small")) {
            return price;
        } 
        else if (size.equalsIgnoreCase("Medium")) {
            return price + 100;
        } 
        else {
            return price + 200;
        }
    }

    void displayPizzaDetails() {
        displayFood();
        System.out.println("Pizza Size: " + size);
        System.out.println("Total Price: " + calculatePrice());
    }
}
public class OnlineFood{
    public static void main(String[] args) {
        Pizza p = new Pizza();
        p.foodName = "Margherita";
        p.price = 200;
        p.size = "Medium";

        p.displayPizzaDetails();
    }
}