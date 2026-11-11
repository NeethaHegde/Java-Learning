package Examples;


class MovieTicket {
    String movieName = "Avatar";
    int ticketPrice = 250;

    MovieTicket(String movieName, int ticketPrice) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;

    }

    // overloading
    void bookTicket() {
        System.out.println("Booking 1 Ticket:" + ticketPrice);
    }

    void bookTicket(int quantity) {
        System.out.println("Booking 2 tickets: " + (ticketPrice*quantity));
    }

    void bookTicket(int quantity, String customerName) {
        System.out.println("Quantity: "+  (ticketPrice*quantity) +" "+ "CustomerName: "+ customerName);
    }

    void calculatePrice() {
        System.out.println("ticket price" + ticketPrice);
    }
}

    // child class 1
    class RegularTicket extends MovieTicket {
        RegularTicket(String movieName, int ticketPrice) {
            super(movieName, ticketPrice);
        }

        @Override
        void calculatePrice() {
            System.out.println("Regular ticketPrice: " + (ticketPrice));
        }
    }


    // child class2
    class PremiumTicket extends MovieTicket {
        PremiumTicket(String movieName, int ticketPrice) {
            super(movieName, ticketPrice);
        }

        @Override
        void calculatePrice() {
            System.out.println("Preminum ticketPrice: " + (ticketPrice + 100));
        }
    }



public class Example2 {
    public static void main(String[] args) {
        RegularTicket rt = new RegularTicket("Kantara", 100);
        PremiumTicket pt = new PremiumTicket("Kantara",100);
        MovieTicket mt = new MovieTicket("Avatar", 250);
        mt.bookTicket();
        mt.bookTicket(2);
        mt.bookTicket(3,"Neetha");
        rt.calculatePrice();
        pt.calculatePrice();
    }

}
