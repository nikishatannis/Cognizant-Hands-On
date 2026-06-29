public class Forecast {

    // Recursive method to calculate future value
    public static double futureValue(double presentValue, double growthRate, int years) {

        if (years == 0) {
            return presentValue;
        }

        return (1 + growthRate) * futureValue(presentValue, growthRate, years - 1);
    }
}