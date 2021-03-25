public class Money {

    private final long hryvnias;
    private final byte kopecks;

    public Money(long hryvnias, byte kopecks) {
        if (kopecks < 0 || hryvnias < 0)
            System.out.println("Money can`t be negative.");
        if (kopecks == 100) {
            hryvnias++;
            kopecks = 0;
        }
        this.hryvnias = hryvnias;
        this.kopecks = kopecks;
    }

    public Money addition(Money money) {
        long resHryvnias = hryvnias + money.hryvnias;
        int resKopecks = kopecks + money.kopecks;
        if (resKopecks > 100) {
            resHryvnias++;
            resKopecks -= 100;
        }
        return new Money(resHryvnias, (byte) resKopecks);
    }

    public Money subtraction(Money money) {
        if (!comparison(money))
            throw new IllegalArgumentException("Money can`t be negative.");
        long resHryvnias = hryvnias - money.hryvnias;
        int resKopecks = kopecks - money.kopecks;
        return new Money(resHryvnias, (byte) resKopecks);
    }

    public static Money toMoney(double num) {
        long hryvnias = (long) num;
        byte kopecks = (byte) ((num - hryvnias) * 100);
        return new Money(hryvnias, kopecks);
    }

    public static double toDouble(Money money) {
        return (money.hryvnias * 100 + money.kopecks) / 100d;
    }

    public Money multiplicationToDouble(double num) {
        double money = Money.toDouble(this);
        return Money.toMoney(money * num);
    }

    public Money multiplication(Money money) {
        return this.multiplicationToDouble(Money.toDouble(money));
    }

    public Money divisionToDouble(double num) {
        double money = Money.toDouble(this);
        return Money.toMoney(money / num);
    }

    public Money division(Money money) {
        return this.divisionToDouble(Money.toDouble(money));
    }

    public boolean isEqual(Money money) {
        return Money.toDouble(this) == Money.toDouble(money);
    }

    public boolean comparison(Money money) {
        return Money.toDouble(this) > Money.toDouble(money);
    }

    @Override
    public String toString() {
        return hryvnias + "," + kopecks;
    }
}