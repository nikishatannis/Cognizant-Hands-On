public class Main {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment("1111-2222-3333"));
        context.executePayment(500);

        System.out.println();

        context.setStrategy(new PayPalPayment("user@gmail.com"));
        context.executePayment(1200);
    }
}