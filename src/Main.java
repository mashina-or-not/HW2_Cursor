public class Main {
    public static void main(String[] args) {

        //Circle area
        Circle.circle_area(5);
        System.out.println("-".repeat(30));

        //Number of objects
        for (int i = 0; i < 5; i++) {
            new NumOfObjects();
        }
        System.out.println("Number of objects: " + NumOfObjects.getCountObjects());
        System.out.println("-".repeat(30));

        //Car
        Car car = new Car();
        car.engineStart();
        car.speedUp(100);
        car.currentSpeed();
        car.speedDown(50);
        car.engineStop();
        car.engineStop();
        System.out.println("-".repeat(30));

        //Fraction
        Fractions fractions1 = new Fractions(2L, (short) 3);
        Fractions fractions2 = new Fractions(1L, (short) 4);
        Fractions fractions3 = new Fractions(5L, (short) 7);
        Fractions operationResult = fractions1.addition(fractions2);
        boolean comparisonResult;
        System.out.printf("%s + %s = %s\n", fractions1, fractions2, operationResult);
        operationResult = fractions2.subtraction(fractions2);
        System.out.printf("%s - %s = %s\n", fractions2, fractions2, operationResult);
        operationResult = fractions2.subtraction(fractions3);
        System.out.printf("%s - %s = %s\n", fractions2, fractions3, operationResult);
        operationResult = fractions1.multiplication(fractions3);
        System.out.printf("%s * %s = %s\n", fractions1, fractions3, operationResult);
        operationResult = fractions3.division(fractions2);
        System.out.printf("%s / %s = %s\n", fractions3, fractions2, operationResult);
        comparisonResult = fractions1.isEqual(fractions3);
        System.out.printf("%s = %s - %s\n", fractions1, fractions3, comparisonResult);
        comparisonResult = fractions2.isEqual(fractions2);
        System.out.printf("%s = %s - %s\n", fractions2, fractions2, comparisonResult);
        comparisonResult = fractions3.comparison(fractions1);
        System.out.printf("%s > %s - %s\n", fractions3, fractions1, comparisonResult);
        comparisonResult = fractions2.comparison(fractions1);
        System.out.printf("%s > %s - %s\n", fractions2, fractions1, comparisonResult);
        System.out.println("-".repeat(30));

        //Money
        Money money1 = new Money(2L, (byte) 40);
        Money money2 = new Money(1L, (byte) 25);
        Money money3 = new Money(5L, (byte) 70);
        Money moneyResult = money1.addition(money2);
        boolean moneyComparison;
        System.out.printf("%s + %s = %s\n", money1, money2, moneyResult);
        moneyResult = money1.addition(money3);
        System.out.printf("%s + %s = %s\n", money1, money3, moneyResult);
        moneyResult = money1.subtraction(money2);
        System.out.printf("%s - %s = %s\n", money1, money2, moneyResult);
        moneyResult = money1.multiplication(money3);
        System.out.printf("%s * %s = %s\n", money1, money3, moneyResult);
        moneyResult = money1.division(money2);
        System.out.printf("%s / %s = %s\n", money1, money2, moneyResult);
        moneyResult = money2.multiplicationToDouble(4);
        System.out.printf("%s * %s = %s\n", money2, 4, moneyResult);
        moneyResult = money3.divisionToDouble(2.5);
        System.out.printf("%s / %s = %s\n", money3, 2.5, moneyResult);
        moneyComparison = money1.isEqual(money2);
        System.out.printf("%s = %s - %s\n", money1, money2, moneyComparison);
        moneyComparison = money1.comparison(money2);
        System.out.printf("%s > %s - %s\n", money1, money2, moneyComparison);
    }
}