package HierarchicalInheritance;

class Payment {
    void processPayment() {
        System.out.println("Processing payment");
    }
}

class CreditCard extends payment {
    void processPayment() {
        System.out.println("Payment through Credit Card");
    }
}

class DebitCard extends payment {
    void processPayment() {
        System.out.println("Payment through Debit Card");
    }
}

class PayPal extends payment {
    void processPayment() {
        System.out.println("Payment through PayPal");
    }
}

public class payment {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.processPayment();

        DebitCard debitCard = new DebitCard();
        debitCard.processPayment();

        PayPal payPal = new PayPal();
        payPal.processPayment();
    }
}
