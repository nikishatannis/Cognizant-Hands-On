public class PaymentContext {

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(int amount) {
        if (strategy == null) {
            System.out.println("No payment method selected");
            return;
        }
        strategy.pay(amount);
    }
}