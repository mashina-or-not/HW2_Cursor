public class Fractions {

    private long numerator;
    private short denominator;

    public Fractions(long numerator, short denominator) {
        if (denominator == 0)
            System.out.println("Denominator can`t be zero!");
        else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public Fractions addition(Fractions fractions) {
        long resNumerator = numerator * fractions.denominator + fractions.numerator * denominator;
        short resDenominator = (short) (denominator * fractions.denominator);
        return new Fractions(resNumerator, resDenominator);
    }

    public Fractions subtraction(Fractions fractions) {
        long resNumerator = numerator * fractions.denominator - fractions.numerator * denominator;
        short resDenominator = (short) (denominator * fractions.denominator);
        return new Fractions(resNumerator, resDenominator);
    }

    public Fractions multiplication(Fractions fractions) {
        long resNumerator = numerator * fractions.numerator;
        short resDenominator = (short) (denominator * fractions.denominator);
        return new Fractions(resNumerator, resDenominator);
    }

    public Fractions division(Fractions fractions) {
        long resNumerator = numerator * fractions.denominator;
        short resDenominator = (short) (denominator * fractions.numerator);
        return new Fractions(resNumerator, resDenominator);
    }

    public boolean isEqual(Fractions fractions) {
        return (double) numerator / denominator == (double) fractions.numerator / fractions.denominator;
    }

    public boolean comparison(Fractions fractions) {
        return (double) numerator / denominator > (double) fractions.numerator / fractions.denominator;
    }

    @Override
    public String toString() {
        return numerator == 0 ? "0" : numerator + "/" + denominator;
    }
}