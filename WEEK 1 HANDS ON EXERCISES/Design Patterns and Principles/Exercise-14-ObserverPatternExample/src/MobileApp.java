public class MobileApp implements Observer {

    @Override
    public void update(String stockName, double stockPrice) {

        System.out.println(
                "Mobile App: " +
                        stockName +
                        " price updated to Rs." +
                        stockPrice
        );
    }
}