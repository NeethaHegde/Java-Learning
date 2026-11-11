class Payment {
    int amount;

    void makePayment() {
        System.out.println("Amount: " + amount);
    }
}

// child class 1
class UPI extends Payment {
    @Override
    void makePayment() {
        System.out.println("UPI payment successful");
        System.out.println("Amount:" +amount);
    }
}

// child class 2
class CreditCard extends Payment {
    @Override
    void makePayment() {
        System.out.println("CreditCard payment successful");
        System.out.println("Amount:" +amount);

    }
}

// child class 3
class DebitCard extends Payment {
    @Override
    void makePayment() {
        System.out.println("DebitCard payment successful");
        System.out.println("Amount:" +amount);

    }
}

public class OnlinePayment {
    public static void main(String[] args) {
        UPI u = new UPI();
        u.amount = 500;
        u.makePayment();

        CreditCard c = new CreditCard();
        c.amount = 1000;
        c.makePayment();

        DebitCard d = new DebitCard();
        d.amount = 2000;
        d.makePayment();


    }
}
